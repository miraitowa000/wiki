package com.example.wiki.controller;

import com.example.wiki.domain.Test;
import com.example.wiki.service.TestService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
    @Resource
    private TestService testService;
    @GetMapping("/test")

    public String test(){
        return "hello world";
    }

    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }


}
