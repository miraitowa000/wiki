package com.example.wiki.service.impl;

import com.auth0.jwt.JWT;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.wiki.common.utils.MD5Utils;
import com.example.wiki.domain.Users;
import com.example.wiki.common.vo.ResultVO;
import com.example.wiki.dto.UserDto;
import com.example.wiki.mapper.UsersMapper;
import com.example.wiki.service.UsersService;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
@Scope("singleton")
public class UserServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

    @Autowired
    private UsersMapper usersMapper;
    @Autowired
    private StringRedisTemplate redisTemplate;
    @Transactional
    public ResultVO userRegister(String username, String password) {
        synchronized (this) {

            // 1.根据用户查询。这个用户是否已经注册
            Users user = usersMapper.queryUserByName(username);
            if (user == null) {
                String md5Password = MD5Utils.md5(password);
                user = new Users();
                user.setUsername(username);
                user.setPassword(md5Password);
                user.setUserRegtime(new Date());
                user.setUserModtime(new Date());
                int i = usersMapper.insertUser(user);
                if (i > 0) {
                    return new ResultVO(10000, "注册成功", null);
                } else {
                    return new ResultVO(10001, "注册失败", null);
                }

            } else {
                return new ResultVO(10001, "用户已经被注册", null);
            }
            // 2.如果没有注册则进行保存操作

        }
    }

    @Override
    public ResultVO userLogin(String username, String password) {
        Users user = usersMapper.queryUserByName(username);
        if(user == null){
            return new ResultVO(10001,"登录失败，用户不存在",null);
        }else {
            String md5Password = MD5Utils.md5(password);
            if(md5Password.equals(user.getPassword())){
                JwtBuilder jwtBuilder = Jwts.builder();
                String token = jwtBuilder.setSubject(user.getUsername())
                        .setIssuedAt(new Date())
                        .setId(user.getUserId().toString())
                        .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24))
                        .signWith(SignatureAlgorithm.HS256, "secret")
                        .compact();
                redisTemplate.opsForValue().set("token",token,20, TimeUnit.HOURS);
                return new ResultVO(10000,token,user);
            }else {
                return new ResultVO(10001,"登录失败，密码错误",null);
            }
        }
    }

    @Override
    public ResultVO queryUserOrder(String userId){

        List<UserDto> userDtoList = usersMapper.queryUserOrder(userId);
        if (userDtoList.isEmpty()){
            return new ResultVO(10001,"用户没有订单",null);
        }else {
            return new ResultVO(10000,"查询成功",userDtoList);
        }

    }

    @Override
    public ResultVO updateUser(Users user) {
        user.setUserModtime(new Date());
        usersMapper.update(user);
        return new ResultVO(10000,"更新成功",null);
    }
}
