package com.example.wiki.service;

import com.example.wiki.domain.Ebook;
import com.example.wiki.domain.Test;
import com.example.wiki.mapper.EbookMapper;
import com.example.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;
    public List<Ebook> list()
    {

        return ebookMapper.selectAll();
    }
}
