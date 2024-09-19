package com.huanf.domain.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <code>QueryCourseParamsDto</code>
 * Description
 * <b>Creation Time:</b> 2024/8/13 15:27.
 *
 * @author xue-freeze
 * @since SpringBootXue
 */
@Data
public class QueryCourseParamsDto {

    @ApiModelProperty("审核状态")
    private String auditStatus;

    @ApiModelProperty("课程名称")
    private String courseName;

    @ApiModelProperty("发布状态")
    private String publishStatus;


}
