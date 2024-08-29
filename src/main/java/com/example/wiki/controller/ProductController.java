package com.example.wiki.controller;

import com.example.wiki.common.vo.ResultVO;
import com.example.wiki.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @RequestMapping("/list")
    public ResultVO selectProductById()
    {
        return productService.selectProductById();
    }
}
