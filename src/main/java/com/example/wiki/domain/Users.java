package com.example.wiki.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.wiki.anno.Sex;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;
import java.util.Date;
@Getter
@Data
@TableName("users")
public class Users {
    @TableId(type= IdType.AUTO)
    @NotNull
    private Integer userId;

    private String username;
    @JsonIgnore
    private String password;
    @NotEmpty
    @Pattern(regexp = "^\\S{1,10}$")
    private String nickname;

    private String realname;

    private String userImg;

    private String userMobile;
    @NotEmpty
    @Email
    private String userEmail;
    @Sex
    @NotEmpty
    private String userSex;

    private Date userBirth;

    private Date userRegtime;

    private Date userModtime;

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg == null ? null : userImg.trim();
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public void setUserBirth(Date date) {
        this.userBirth = date;
    }

    public void setUserRegtime(Date date) {
        this.userRegtime = date;
    }

    public void setUserModtime(Date date) {
        this.userModtime = date;
    }
}