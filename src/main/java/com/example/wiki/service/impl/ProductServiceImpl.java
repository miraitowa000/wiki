package com.example.wiki.service.impl;

import com.example.wiki.common.vo.ResultVO;
import com.example.wiki.domain.ProductVo;
import com.example.wiki.mapper.ProductMapper;
import com.example.wiki.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public ResultVO selectProductById() {
        List<ProductVo> productVos = productMapper.selectAllProduct();
        ResultVO resultVO = new ResultVO(200, "success", productVos);
        return resultVO;
    }
}
