package com.kxtech.modules.system.dto.input;

import com.kxtech.modules.common.dto.input.BasePageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 系统管理-菜单表 查询参数
 *
 *
 * @description:
 * @date: 2019-08-19
 */
@Data
@ApiModel(description = "系统管理-菜单表 查询参数")
public class MenuQueryPara extends BasePageQuery{
    @ApiModelProperty(value = "id")
    private Integer id;
}
