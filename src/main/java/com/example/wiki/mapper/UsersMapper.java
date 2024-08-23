package com.example.wiki.mapper;

import com.example.wiki.domain.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersMapper {
    // 用户注册
    int insertUser(Users user);

    // 根据用户名查询用户信息

    Users queryUserByName(String username);
}