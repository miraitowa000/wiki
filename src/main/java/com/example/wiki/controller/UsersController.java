package com.example.wiki.controller;

import com.example.wiki.domain.PageBean;
import com.example.wiki.domain.Users;
import com.example.wiki.dto.RegisterRequestDto;
import com.example.wiki.common.vo.ResultVO;
import com.example.wiki.service.UsersService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;

@RestController
@RequestMapping("/v1/user")
@Validated
public class UsersController {
    @Resource
    private UsersService usersService;
    @GetMapping("/login")
    public ResultVO login(@RequestBody RegisterRequestDto registerRequestDto) {
        ResultVO resultVO = usersService.userLogin(registerRequestDto.getUsername(), registerRequestDto.getPassword());
        return resultVO;

    }

    @PostMapping("/register")
    public ResultVO register(@Valid  @RequestBody RegisterRequestDto registerRequestDto) {
        ResultVO resultVO = usersService.userRegister(registerRequestDto.getUsername(),registerRequestDto.getPassword());
        return resultVO;
    }

    @GetMapping("/order")
    public ResultVO queryUserOrder(@RequestParam("userId") String userId) {
        ResultVO resultVO = usersService.queryUserOrder(userId);
        return resultVO;
    }

    @PostMapping("/update")
    public ResultVO updateUser(@RequestBody @Validated Users user) {
        ResultVO resultVO = usersService.updateUser(user);
        return resultVO;
    }
}
