package com.example.wiki.service.impl;

import com.example.wiki.domain.IndexImg;
import com.example.wiki.common.vo.ResultVO;
import com.example.wiki.mapper.IndexImgMapper;
import com.example.wiki.service.IndexImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IndexImgServiceImpl implements IndexImgService {

    @Autowired
    private IndexImgMapper indexImgMapper;

    @Override
    public ResultVO selectIndexImg() {
        List<IndexImg> indexImg = indexImgMapper.selectIndexImg();
        if(indexImg.isEmpty()){
            return new ResultVO(500,"fail",null);
        }else {
            return new ResultVO(200,"success",indexImg);
        }
    }
}
