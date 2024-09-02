package com.example.wiki.service.impl;

import com.example.wiki.common.vo.ResultVO;
import com.example.wiki.domain.ProductParams;
import com.example.wiki.mapper.ProductImgMapper;
import com.example.wiki.mapper.ProductMapper;
import com.example.wiki.mapper.ProductParamsMapper;
import com.example.wiki.service.ProductDetailService;
import jdk.nashorn.internal.runtime.ListAdapter;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Service
public class ProductDetailServiceImpl implements ProductDetailService {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductParamsMapper productParamsMapper;
    @Override
    public ResultVO selectProductDetail(@Param("productId") String productId) {
        ResultVO resultVO = new ResultVO(200,"success",productMapper.selectProductDetail(productId));
        return resultVO;
    }

    @Override
    public ResultVO getParamsByProductId(@Param("productId") String productId) {
        List<ProductParams> productParams = productParamsMapper.selectByProductId(productId);
        if(productParams.isEmpty()){
            return new ResultVO(400,"暂无数据","");
        }else {
            return new ResultVO(200,"success",productParams);
        }
    }

}
