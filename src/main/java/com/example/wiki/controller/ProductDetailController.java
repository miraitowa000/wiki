package com.example.wiki.controller;

import com.example.wiki.common.vo.ResultVO;
import com.example.wiki.service.ProductDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/productDetail")
public class ProductDetailController {
    @Autowired
    private ProductDetailService productDetailService;
    @GetMapping("/detail")
    public ResultVO selectProductDetail(@RequestParam(value = "productId") String productId){
        return productDetailService.selectProductDetail(productId);
    }

    @GetMapping("/params")
    public ResultVO getParamsByProductId(@RequestParam(value = "productId") String productId){
        return productDetailService.getParamsByProductId(productId);
    }
}
