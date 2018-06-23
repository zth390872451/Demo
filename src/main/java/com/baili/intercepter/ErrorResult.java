package com.baili.intercepter;

public class ErrorResult {
    /**
     * 异常码
     */
    protected String code;
    /**
     * 异常信息
     */
    protected String msg;

    protected ErrorResult() {}

    public ErrorResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}