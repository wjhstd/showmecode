package com.kxtech.modules.common.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 *  <p> 修改时间 </p>
 *
 * @description:
 *
 * @date: 2019/8/18 0018 1:30
 */
@Getter
@Setter
public abstract class BaseEntity<T extends Model> extends com.kxtech.modules.common.entity.BaseAddEntity<T> {
   
    @ApiModelProperty(value = "修改时间")
    @TableField(value = "gmt_modified", fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;
//    @TableField(value = "modifier_id", fill = FieldFill.INSERT_UPDATE)
//    private Long modifierId;
}
