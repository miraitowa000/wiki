package com.example.wiki.domain;

import java.time.LocalDateTime;

/**
 * Database Table Remarks:
 *   商品参数
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table product_params
 */
public class ProductParams {
    /**
     * Database Column Remarks:
     *   商品参数id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_params.param_id
     *
     * @mbg.generated
     */
    private String paramId;

    /**
     * Database Column Remarks:
     *   商品id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_params.product_id
     *
     * @mbg.generated
     */
    private Integer productId;

    /**
     * Database Column Remarks:
     *   产地
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_params.product_place
     *
     * @mbg.generated
     */
    private String productPlace;

    /**
     * Database Column Remarks:
     *   保质期
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_params.foot_penod
     *
     * @mbg.generated
     */
    private String footPenod;

    /**
     * Database Column Remarks:
     *   品牌名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_params.brand
     *
     * @mbg.generated
     */
    private String brand;

    /**
     * Database Column Remarks:
     *   生产厂名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_params.factory_name
     *
     * @mbg.generated
     */
    private String factoryName;

    /**
     * Database Column Remarks:
     *   生产厂地
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_params.factory_address
     *
     * @mbg.generated
     */
    private String factoryAddress;

    /**
     * Database Column Remarks:
     *   包装方式
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_params.packaging_method
     *
     * @mbg.generated
     */
    private String packagingMethod;

    /**
     * Database Column Remarks:
     *   规格重量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_params.weight
     *
     * @mbg.generated
     */
    private String weight;

    /**
     * Database Column Remarks:
     *   存储方式
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_params.storage_method
     *
     * @mbg.generated
     */
    private String storageMethod;

    /**
     * Database Column Remarks:
     *   食用方式
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_params.eat_method
     *
     * @mbg.generated
     */
    private String eatMethod;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_params.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_params.update_time
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_params.param_id
     *
     * @return the value of product_params.param_id
     *
     * @mbg.generated
     */
    public String getParamId() {
        return paramId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_params.param_id
     *
     * @param paramId the value for product_params.param_id
     *
     * @mbg.generated
     */
    public void setParamId(String paramId) {
        this.paramId = paramId == null ? null : paramId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_params.product_id
     *
     * @return the value of product_params.product_id
     *
     * @mbg.generated
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_params.product_id
     *
     * @param productId the value for product_params.product_id
     *
     * @mbg.generated
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_params.product_place
     *
     * @return the value of product_params.product_place
     *
     * @mbg.generated
     */
    public String getProductPlace() {
        return productPlace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_params.product_place
     *
     * @param productPlace the value for product_params.product_place
     *
     * @mbg.generated
     */
    public void setProductPlace(String productPlace) {
        this.productPlace = productPlace == null ? null : productPlace.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_params.foot_penod
     *
     * @return the value of product_params.foot_penod
     *
     * @mbg.generated
     */
    public String getFootPenod() {
        return footPenod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_params.foot_penod
     *
     * @param footPenod the value for product_params.foot_penod
     *
     * @mbg.generated
     */
    public void setFootPenod(String footPenod) {
        this.footPenod = footPenod == null ? null : footPenod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_params.brand
     *
     * @return the value of product_params.brand
     *
     * @mbg.generated
     */
    public String getBrand() {
        return brand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_params.brand
     *
     * @param brand the value for product_params.brand
     *
     * @mbg.generated
     */
    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_params.factory_name
     *
     * @return the value of product_params.factory_name
     *
     * @mbg.generated
     */
    public String getFactoryName() {
        return factoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_params.factory_name
     *
     * @param factoryName the value for product_params.factory_name
     *
     * @mbg.generated
     */
    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName == null ? null : factoryName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_params.factory_address
     *
     * @return the value of product_params.factory_address
     *
     * @mbg.generated
     */
    public String getFactoryAddress() {
        return factoryAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_params.factory_address
     *
     * @param factoryAddress the value for product_params.factory_address
     *
     * @mbg.generated
     */
    public void setFactoryAddress(String factoryAddress) {
        this.factoryAddress = factoryAddress == null ? null : factoryAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_params.packaging_method
     *
     * @return the value of product_params.packaging_method
     *
     * @mbg.generated
     */
    public String getPackagingMethod() {
        return packagingMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_params.packaging_method
     *
     * @param packagingMethod the value for product_params.packaging_method
     *
     * @mbg.generated
     */
    public void setPackagingMethod(String packagingMethod) {
        this.packagingMethod = packagingMethod == null ? null : packagingMethod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_params.weight
     *
     * @return the value of product_params.weight
     *
     * @mbg.generated
     */
    public String getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_params.weight
     *
     * @param weight the value for product_params.weight
     *
     * @mbg.generated
     */
    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_params.storage_method
     *
     * @return the value of product_params.storage_method
     *
     * @mbg.generated
     */
    public String getStorageMethod() {
        return storageMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_params.storage_method
     *
     * @param storageMethod the value for product_params.storage_method
     *
     * @mbg.generated
     */
    public void setStorageMethod(String storageMethod) {
        this.storageMethod = storageMethod == null ? null : storageMethod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_params.eat_method
     *
     * @return the value of product_params.eat_method
     *
     * @mbg.generated
     */
    public String getEatMethod() {
        return eatMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_params.eat_method
     *
     * @param eatMethod the value for product_params.eat_method
     *
     * @mbg.generated
     */
    public void setEatMethod(String eatMethod) {
        this.eatMethod = eatMethod == null ? null : eatMethod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_params.create_time
     *
     * @return the value of product_params.create_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_params.create_time
     *
     * @param createTime the value for product_params.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_params.update_time
     *
     * @return the value of product_params.update_time
     *
     * @mbg.generated
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_params.update_time
     *
     * @param updateTime the value for product_params.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}