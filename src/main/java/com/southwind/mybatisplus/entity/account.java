package com.southwind.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

@Data
@TableName(value = "user", schema= "mybatis")
public class account {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer 编号;
    @TableField(value = "name")
    private String title;
    private Integer age;
    @TableField(exist = false)
    private String gender;
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;//数据库的中字段名为create_time，MyBatis会自动将下划线转成驼峰
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;//数据库的中字段名为update_time，MyBatis会自动将下划线转成驼峰

}
