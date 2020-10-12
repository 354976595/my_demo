package com.example.mybatis.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("action")
@Data
public class Action {
    @TableId("id")
    private Long id;
    @TableField("action_name")
    private String actionName;
}
