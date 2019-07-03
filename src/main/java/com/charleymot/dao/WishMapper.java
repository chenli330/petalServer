package com.charleymot.dao;

import com.charleymot.entity.Wish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WishMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Wish record);

    int insertSelective(Wish record);

    Wish selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Wish record);

    int updateByPrimaryKey(Wish record);

    List<Wish> getPageWish(int pageNum, int pageSize);

    int getPageSize();
}