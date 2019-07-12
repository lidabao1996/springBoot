package com.example.demo.pos.dao.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("url_path")
public class UrlPathModel {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("url")
    private String url;

    @TableField("status")
    private int status;
}
