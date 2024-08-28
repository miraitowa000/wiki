package com.example.wiki.controller;

import com.example.wiki.common.vo.ResultVO;
import com.example.wiki.service.IndexImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/index")
public class IndexImgController {

    @Autowired
    private IndexImgService indexImgService;
    @GetMapping("/indexImg")
    public ResultVO selectIndexImg()
    {
        return indexImgService.selectIndexImg();
    }


}
