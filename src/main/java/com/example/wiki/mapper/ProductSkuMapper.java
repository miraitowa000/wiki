package com.example.wiki.mapper;

import com.example.wiki.domain.ProductSku;
import java.util.List;

public interface ProductSkuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_sku
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String skuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_sku
     *
     * @mbg.generated
     */
    int insert(ProductSku record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_sku
     *
     * @mbg.generated
     */
    ProductSku selectByPrimaryKey(String skuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_sku
     *
     * @mbg.generated
     */
    List<ProductSku> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_sku
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ProductSku record);
}