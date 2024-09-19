package com.huanf.base.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <code>PageParams</code>
 * Description
 * <b>Creation Time:</b> 2024/8/13 15:31.
 *
 * @author xue-freeze
 * @since SpringBootXue
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageParams {

    @ApiModelProperty("当前页码")
    private Long pageNo = 1L;

    @ApiModelProperty("每页显示多少条数据")
    private Long pageSize =10L;

}
