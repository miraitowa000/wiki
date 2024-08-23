package com.example.wiki.service;

import com.example.wiki.dto.ResultVO;

public interface UsersService {
    // 用户注册
    public ResultVO userRegister(String username, String password);

    // 用户登录
    public ResultVO userLogin(String username, String password);
}
