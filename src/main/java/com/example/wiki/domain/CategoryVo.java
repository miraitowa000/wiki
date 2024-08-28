package com.example.wiki.domain;


import java.util.List;

/**
 * Database Table Remarks:
 *   商品分类
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table category
 */
public class CategoryVo {
    /**
     * Database Column Remarks:
     *   主键id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.category_id
     *
     * @mbg.generated
     */
    private String categoryId;

    /**
     * Database Column Remarks:
     *   分类名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.category_name
     *
     * @mbg.generated
     */
    private String categoryName;

    /**
     * Database Column Remarks:
     *   分类层级
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.category_level
     *
     * @mbg.generated
     */
    private Integer categoryLevel;

    /**
     * Database Column Remarks:
     *   父层级id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.parent_id
     *
     * @mbg.generated
     */
    private Integer parentId;

    /**
     * Database Column Remarks:
     *   图标
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.category_icon
     *
     * @mbg.generated
     */
    private String categoryIcon;

    /**
     * Database Column Remarks:
     *   口号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.category_slogan
     *
     * @mbg.generated
     */
    private String categorySlogan;

    /**
     * Database Column Remarks:
     *   分类图
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.category_pic
     *
     * @mbg.generated
     */
    private String categoryPic;

    /**
     * Database Column Remarks:
     *   背景颜色
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.category_bg_color
     *
     * @mbg.generated
     */
    private String categoryBgColor;

    private List<CategoryVo> categories;

    public List<CategoryVo> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryVo> categories) {
        this.categories = categories;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.category_id
     *
     * @return the value of category.category_id
     *
     * @mbg.generated
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.category_id
     *
     * @param categoryId the value for category.category_id
     *
     * @mbg.generated
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.category_name
     *
     * @return the value of category.category_name
     *
     * @mbg.generated
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.category_name
     *
     * @param categoryName the value for category.category_name
     *
     * @mbg.generated
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.category_level
     *
     * @return the value of category.category_level
     *
     * @mbg.generated
     */
    public Integer getCategoryLevel() {
        return categoryLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.category_level
     *
     * @param categoryLevel the value for category.category_level
     *
     * @mbg.generated
     */
    public void setCategoryLevel(Integer categoryLevel) {
        this.categoryLevel = categoryLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.parent_id
     *
     * @return the value of category.parent_id
     *
     * @mbg.generated
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.parent_id
     *
     * @param parentId the value for category.parent_id
     *
     * @mbg.generated
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.category_icon
     *
     * @return the value of category.category_icon
     *
     * @mbg.generated
     */
    public String getCategoryIcon() {
        return categoryIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.category_icon
     *
     * @param categoryIcon the value for category.category_icon
     *
     * @mbg.generated
     */
    public void setCategoryIcon(String categoryIcon) {
        this.categoryIcon = categoryIcon == null ? null : categoryIcon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.category_slogan
     *
     * @return the value of category.category_slogan
     *
     * @mbg.generated
     */
    public String getCategorySlogan() {
        return categorySlogan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.category_slogan
     *
     * @param categorySlogan the value for category.category_slogan
     *
     * @mbg.generated
     */
    public void setCategorySlogan(String categorySlogan) {
        this.categorySlogan = categorySlogan == null ? null : categorySlogan.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.category_pic
     *
     * @return the value of category.category_pic
     *
     * @mbg.generated
     */
    public String getCategoryPic() {
        return categoryPic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.category_pic
     *
     * @param categoryPic the value for category.category_pic
     *
     * @mbg.generated
     */
    public void setCategoryPic(String categoryPic) {
        this.categoryPic = categoryPic == null ? null : categoryPic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.category_bg_color
     *
     * @return the value of category.category_bg_color
     *
     * @mbg.generated
     */
    public String getCategoryBgColor() {
        return categoryBgColor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.category_bg_color
     *
     * @param categoryBgColor the value for category.category_bg_color
     *
     * @mbg.generated
     */
    public void setCategoryBgColor(String categoryBgColor) {
        this.categoryBgColor = categoryBgColor == null ? null : categoryBgColor.trim();
    }
}