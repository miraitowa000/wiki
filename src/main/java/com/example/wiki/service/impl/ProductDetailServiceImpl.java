package com.example.wiki.service.impl;

import com.example.wiki.common.vo.ResultVO;
import com.example.wiki.domain.ProductComments;
import com.example.wiki.domain.ProductParams;
import com.example.wiki.mapper.ProductCommentsMapper;
import com.example.wiki.mapper.ProductImgMapper;
import com.example.wiki.mapper.ProductMapper;
import com.example.wiki.mapper.ProductParamsMapper;
import com.example.wiki.service.ProductDetailService;
import jdk.nashorn.internal.runtime.ListAdapter;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductDetailServiceImpl implements ProductDetailService {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductParamsMapper productParamsMapper;

    @Autowired
    private ProductCommentsMapper productCommentsMapper;


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

    @Override
    public ResultVO getCommentsByProductId(@Param("productId") String productId) {
        List<ProductComments> productComments = productCommentsMapper.getCommentsByProductId(productId);
        if(productComments.isEmpty()){
            return new ResultVO(400,"暂无数据","");
        }else {
            return new ResultVO(200,"success",productComments);
        }
    }

    @Override
    public ResultVO selectCommentsByKeyword(String productId, String userId, String commLevel, String commType) {
        Map<String,Object> params = new HashMap<>();
        params.put("productId",productId);
        params.put("userId",userId);
        params.put("commLevel",commLevel);
        params.put("commType",commType);
        List<ProductComments> productComments = productCommentsMapper.selectCommentsByKeyword(params);
        if(productComments.isEmpty()){
            return new ResultVO(400,"暂无数据","");
        }else {
            return new ResultVO(200,"success",productComments);
        }
    }

}
