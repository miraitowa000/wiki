package com.example.wiki.mapper;

import com.example.wiki.domain.Ebook;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface EbookMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Ebook record);

    Ebook selectByPrimaryKey(Long id);

    List<Ebook> selectAll();

    int updateByPrimaryKey(Ebook record);
}