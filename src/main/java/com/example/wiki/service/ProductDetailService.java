package com.example.wiki.service;

import com.example.wiki.common.vo.ResultVO;
import org.apache.ibatis.annotations.Param;

public interface ProductDetailService {
    public ResultVO selectProductDetail(@Param("productId") String productId);
}
