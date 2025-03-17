package com.example.wiki.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * 日志配置类
 * 用于配置日志相关参数，与logback-spring.xml配合使用
 */
@Configuration
@EnableConfigurationProperties
public class LoggingConfig {
    
    /**
     * 日志配置属性
     */
    @Bean
    @ConfigurationProperties(prefix = "logging")
    public LoggingProperties loggingProperties() {
        return new LoggingProperties();
    }
    
    /**
     * 日志属性类
     */
    public static class LoggingProperties {
        private String level;
        private String filePath;
        private int maxHistory;
        private String maxFileSize;
        
        public String getLevel() {
            return level;
        }
        
        public void setLevel(String level) {
            this.level = level;
        }
        
        public String getFilePath() {
            return filePath;
        }
        
        public void setFilePath(String filePath) {
            this.filePath = filePath;
        }
        
        public int getMaxHistory() {
            return maxHistory;
        }
        
        public void setMaxHistory(int maxHistory) {
            this.maxHistory = maxHistory;
        }
        
        public String getMaxFileSize() {
            return maxFileSize;
        }
        
        public void setMaxFileSize(String maxFileSize) {
            this.maxFileSize = maxFileSize;
        }
    }
}