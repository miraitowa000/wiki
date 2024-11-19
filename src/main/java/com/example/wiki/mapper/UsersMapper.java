package com.example.wiki.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.wiki.domain.Users;
import com.example.wiki.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface UsersMapper extends BaseMapper<Users> {
    // 用户注册
    int insertUser(Users user);

    // 根据用户名查询用户信息

    Users queryUserByName(String username);

    @Select("SELECT u.username,u.nickname,o.order_id,o.receiver_name from users u left JOIN orders o on u.user_id = o.user_id where o.user_id=#{userId}")
    List<UserDto> queryUserOrder(@Param("userId") String userId);

    @Update("UPDATE users SET nickname=#{nickname},realname=#{realname},user_mobile=#{userMobile},user_email=#{userEmail} ,user_modtime=#{userModtime} where user_id = #{userId}")
    void update(Users user);
}