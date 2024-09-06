package com.example.wiki.controller;

import com.example.wiki.dto.RegisterRequestDto;
import com.example.wiki.common.vo.ResultVO;
import com.example.wiki.service.UsersService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/v1/user")
public class UsersController {
    @Resource
    private UsersService usersService;
    @GetMapping("/login")
    public ResultVO login(@RequestBody RegisterRequestDto registerRequestDto) {
        ResultVO resultVO = usersService.userLogin(registerRequestDto.getUsername(), registerRequestDto.getPassword());
        return resultVO;

    }

    @PostMapping("/register")
    public ResultVO register(@RequestBody RegisterRequestDto registerRequestDto) {
        ResultVO resultVO = usersService.userRegister(registerRequestDto.getUsername(),registerRequestDto.getPassword());
        return resultVO;
    }

    @GetMapping("/order")
    public ResultVO queryUserOrder(@RequestParam("userId") String userId) {
        ResultVO resultVO = usersService.queryUserOrder(userId);
        return resultVO;
    }
}
