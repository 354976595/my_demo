package com.example.mybatis.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatis.entity.Action;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper

public interface UserMapper extends BaseMapper<Action> {
    List<Action> getActionList();

    @Select("select * from action where id >#{id}")
    List<Action> selectAll(@Param("id") Long id);

    /**
     * 测试mybatis映射mapper1
     *
     * @return
     */
    List<Object> testCollection();

    /**
     * 测试mybatis映射mapper2
     *
     * @return
     */
    List<Object> testCollection2();

    //测试动态sql
    List<Object> getDynamicsql(@Param("action")Action action);
}