package com.example.demo.pos.dao.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 关于我们信息表
 * </p>
 *
 * @author
 * @since 2019-05-24
 */
@Data
@TableName("t_about")
public class AboutEntity extends Model<AboutEntity> {

    private static final long serialVersionUID = 1L;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 信息类型（1 关于天合; 2 部门联系人; 3 联系我们; 4 行车路线）
     */
    @TableField("info_type")
    private Integer infoType;

    /**
     * 信息详情
     */
    @TableField("info_detail")
    private String infoDetail;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 创建用户
     */
    @TableField("create_user")
    private String createUser;


}
