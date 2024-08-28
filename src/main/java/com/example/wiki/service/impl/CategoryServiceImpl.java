package com.example.wiki.service.impl;

import com.example.wiki.common.vo.ResultVO;
import com.example.wiki.domain.CategoryVo;
import com.example.wiki.mapper.CategoryMapper;
import com.example.wiki.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public ResultVO selectAllCategory() {
        List<CategoryVo> categories = categoryMapper.selectAllCategory();
        ResultVO resultVO = new ResultVO(200,"success",categories);
        return resultVO;

    }

}
