package com.example.wiki.service.impl;

import com.example.wiki.common.vo.ResultVO;
import com.example.wiki.mapper.ProductImgMapper;
import com.example.wiki.mapper.ProductMapper;
import com.example.wiki.service.ProductDetailService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class ProductDetailServiceImpl implements ProductDetailService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public ResultVO selectProductDetail(@Param("productId") String productId) {
        ResultVO resultVO = new ResultVO(200,"success",productMapper.selectProductDetail(productId));
        return resultVO;
    }
}
