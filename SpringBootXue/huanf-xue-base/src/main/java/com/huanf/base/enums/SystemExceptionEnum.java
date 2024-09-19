package com.huanf.base.enums;

/**
 * <code>SystemExceptionEnum</code>
 * Description
 * <b>Creation Time:</b> 2024/8/23 11:00.
 *
 * @author xue-freeze
 * @since SpringBootXue
 */
public enum SystemExceptionEnum {

    UNKOWN_ERROR("执行过程异常，请重试。"),
    PARAMS_ERROR("非法参数"),
    OBJECT_NULL("对象为空"),
    QUERY_NULL("查询结果为空"),
    REQUEST_NULL("请求参数为空");

    private String errMessage;

    public String getErrMessage() {
        return errMessage;
    }

    private SystemExceptionEnum( String errMessage) {
        this.errMessage = errMessage;
    }

}
