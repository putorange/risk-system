package com.ietunnel.riskservice.significantRisk.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 安全管理评估指标分类
 * </p>
 *
 * @author wxb
 * @since 2022-01-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SafeManagementClassification对象", description="安全管理评估指标分类")
public class SafeManagementClassification implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "安全管理评估指标分类id")
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    @ApiModelProperty(value = "安全管理评估指标体系评估指标id")
    private String indicatorId;

    @ApiModelProperty(value = "安全管理评估指标分类名称")
    private String name;

    @ApiModelProperty(value = "标准分值")
    private Integer score;

    @ApiModelProperty(value = "逻辑删除 1（true）已删除， 0（false）未删除")
    @TableLogic
    private Integer isDeleted;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;

    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;


}
