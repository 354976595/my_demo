package com.example.mybatis.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatis.entity.ActionPart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ActionPartRef extends BaseMapper<ActionPart> {
    List<ActionPart> getPartRef(Long actionId);
}
