package com.example.wiki.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.wiki.common.vo.ResultVO;
import com.example.wiki.domain.Users;
import org.apache.catalina.User;

public interface UsersService extends IService<Users> {
    // 用户注册
    public ResultVO userRegister(String username, String password);

    // 用户登录
    public ResultVO userLogin(String username, String password);

    public ResultVO queryUserOrder(String userId);
}
