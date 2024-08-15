package com.example.wiki.controller;

import com.example.wiki.domain.Ebook;
import com.example.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/v1/ebook")
public class EbookController {
    @Resource
    private EbookService ebookService;
    @GetMapping("/test")

    public String test(){
        return "hello world";
    }

    @GetMapping("/list")
    public List<Ebook> list(){
        return ebookService.list();
    }


}
