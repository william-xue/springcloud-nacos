package com.huanf.base.exception;

import com.huanf.base.enums.SystemExceptionEnum;

/**
 * @author: 35238
 * 功能: 统一异常处理
 *
 */
public class SystemException extends RuntimeException{

    private String errMessage;

    public SystemException() {
        super();
    }

    public SystemException(String errMessage) {
        super(errMessage);
        this.errMessage = errMessage;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public static void cast(SystemExceptionEnum commonError){
        throw new SystemException(commonError.getErrMessage());
    }
    public static void cast(String errMessage){
        throw new SystemException(errMessage);
    }

}