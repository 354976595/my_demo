package com.example.mybatis.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.security.SecureRandom;
import java.util.Date;
@Data
@TableName("action_part_relation")
public class ActionPart implements Serializable {
    @TableId("id")
    private Long id ;
    @TableField("action_id")
    private Long actionId;
    @TableField("action_part")
    private Long actionPart;
    @TableField("part_name")
    private String partName;
    @TableField("create_time")
    private Date createTime;
    @TableField("del_flag")
    private Integer delFlag;
}
