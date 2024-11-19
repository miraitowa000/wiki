package com.example.wiki.interceptor;

import com.example.wiki.common.utils.ThreadLocalUtils;
import com.example.wiki.common.vo.ResultVO;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.UnsupportedJwtException;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String method = request.getMethod();
        if (method.equals("OPTIONS")) {
            return true;
        }
        String token = request.getHeader("Authorization");
        if (token == null) {
            ResultVO resultVO = new ResultVO(401, "请先登录", null);
            doResponse(response, resultVO);
            return false;
        }else {
            try {
                JwtParser jwtParser = Jwts.parser();
                jwtParser.setSigningKey("secret");
                jwtParser.parseClaimsJws(token);
                return true;
            }catch (ExpiredJwtException e) {
                ResultVO resultVO = new ResultVO(401, "token过期", null);
                doResponse(response, resultVO);
                return false;
            }catch (UnsupportedJwtException e) {
                ResultVO resultVO = new ResultVO(401, "token无效", null);
                doResponse(response, resultVO);
                return false;
            }catch (Exception e){
                ResultVO resultVO = new ResultVO(401, "请先登录3333333", null);
                doResponse(response, resultVO);

            }
            }
        return false;

            }

    private void doResponse(HttpServletResponse response, ResultVO resultVO) throws Exception {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        PrintWriter printWriter = response.getWriter();
        String s = new ObjectMapper().writeValueAsString(resultVO);
        printWriter.print(s);
        printWriter.flush();
        printWriter.close();
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        ThreadLocalUtils.remove();
    }
}


