package com.ietunnel.riskservice.overallRiskAssessment.entity;

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
 * 总体风险评估指标体系的分类
 * </p>
 *
 * @author wxb
 * @since 2022-01-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="OverallRiskClassification对象", description="总体风险评估指标体系的分类")
public class OverallRiskClassification implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "总体风险评估指标体系的分类id")
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    @ApiModelProperty(value = "总体风险子评估指标体系子评估指标id")
    private String subindicatorId;

    @ApiModelProperty(value = "总体风险评估指标体系的分类名称")
    private String name;

    @ApiModelProperty(value = "标准分值")
    private String score;

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