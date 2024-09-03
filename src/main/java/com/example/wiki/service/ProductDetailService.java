package com.example.wiki.service;

import com.example.wiki.common.vo.ResultVO;
import org.apache.ibatis.annotations.Param;

public interface ProductDetailService {
    public ResultVO selectProductDetail(@Param("productId") String productId);

    public ResultVO getParamsByProductId(@Param("productId") String productId);

    public ResultVO getCommentsByProductId(@Param("productId") String productId);

    public ResultVO selectCommentsByKeyword(String productId,String userId,String commLevel,String commType);
}
