package com.example.wiki.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;
@Data
@TableName("users")
public class Users {
    @TableId(type= IdType.AUTO)
    private Integer userId;

    private String username;

    private String password;

    private String nickname;

    private String realname;

    private String userImg;

    private String userMobile;

    private String userEmail;

    private String userSex;

    private Date userBirth;

    private Date userRegtime;

    private Date userModtime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg == null ? null : userImg.trim();
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public Date getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(Date date) {
        this.userBirth = date;
    }

    public Date getUserRegtime() {
        return userRegtime;
    }

    public void setUserRegtime(Date date) {
        this.userRegtime = date;
    }

    public Date getUserModtime() {
        return userModtime;
    }

    public void setUserModtime(Date date) {
        this.userModtime = date;
    }
}