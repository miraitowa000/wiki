package com.example.wiki.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @GetMapping("/test")

    public String test(){
        return "hello world";
    }
}
