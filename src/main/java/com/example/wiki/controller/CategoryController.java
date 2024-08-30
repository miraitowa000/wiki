package com.example.wiki.controller;

import com.example.wiki.common.vo.ResultVO;
import com.example.wiki.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/list")
    public ResultVO selectAllCategory()
    {
        return categoryService.selectAllCategory();
    }

    @GetMapping("/category-recommends")
    public ResultVO listRecommendProductsByCategory()
    {
        return categoryService.listFirstLevelCategories();
    }

}
