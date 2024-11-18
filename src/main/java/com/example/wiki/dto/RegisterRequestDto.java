package com.example.wiki.dto;

import javax.validation.constraints.Pattern;
public class RegisterRequestDto {
    @Pattern(regexp = "^[a-zA-Z0-9_-]{4,16}$", message = "用户名必须为4-16位的字母、数字、下划线或横线")
    private String username;
    @Pattern(regexp = "^[a-zA-Z0-9_-]{6,16}$", message = "密码必须为6-16位的字母、数字、下划线")
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
