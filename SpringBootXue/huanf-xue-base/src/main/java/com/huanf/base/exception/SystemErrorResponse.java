package com.huanf.base.exception;

import java.io.Serializable;

/**
 * @author: 35238
 * 功能: 统一异常处理的响应封装
 */
public class SystemErrorResponse implements Serializable {
    private String errMessage;

    public SystemErrorResponse(String errMessage){
        this.errMessage= errMessage;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }
}