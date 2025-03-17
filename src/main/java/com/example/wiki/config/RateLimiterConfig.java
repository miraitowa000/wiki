package com.example.wiki.config;

import com.google.common.util.concurrent.RateLimiter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.TimeUnit;

/**
 * 请求限流配置
 */
@Configuration
public class RateLimiterConfig implements WebMvcConfigurer {

    /**
     * 创建一个令牌桶限流器，每秒生成50个令牌
     */
    @Bean
    public RateLimiter rateLimiter() {
        // 创建一个每秒生成50个令牌的限流器
        return RateLimiter.create(50);
    }

    /**
     * 限流拦截器
     */
    private class RateLimiterInterceptor extends HandlerInterceptorAdapter {
        private final RateLimiter rateLimiter;

        public RateLimiterInterceptor(RateLimiter rateLimiter) {
            this.rateLimiter = rateLimiter;
        }

        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
            // 尝试获取令牌，等待100毫秒
            boolean acquired = rateLimiter.tryAcquire(1, 100, TimeUnit.MILLISECONDS);
            if (!acquired) {
                // 获取令牌失败，返回429状态码（Too Many Requests）
                response.setStatus(HttpStatus.TOO_MANY_REQUESTS.value());
                response.getWriter().write("Too many requests, please try again later.");
                return false;
            }
            return true;
        }
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 添加限流拦截器，应用于所有API请求
        registry.addInterceptor(new RateLimiterInterceptor(rateLimiter()))
                .addPathPatterns("/api/**");
    }
}