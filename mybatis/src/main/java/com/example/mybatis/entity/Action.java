package com.example.mybatis.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

@TableName("action")
@Data
public class Action {
    @TableId("id")
    private Long id;
    @TableField("action_name")
    private String actionName;
    /**
     * 一对多
     */
    @TableField(exist = false)
    private List<ActionPart> refs;
    /**
     * 一对一
     */
    @TableField(exist = false)
    private Object ref;

    @TableField
    private List<Long> primaryId;
}
