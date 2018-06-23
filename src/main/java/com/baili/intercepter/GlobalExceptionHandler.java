package com.baili.intercepter;

import org.slf4j.LoggerFactory;
import org.springframework.beans.TypeMismatchException;
import org.springframework.boot.SpringApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.slf4j.Logger;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringApplication.class);
    /**
     * 不合法的请求格式异常
     * @param ex
     * @return
     */
    @ExceptionHandler(TypeMismatchException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorResult handleTypeMismatchException(TypeMismatchException ex) {
        LOGGER.error("不合法的请求格式", ex);
        return new ErrorResult("400", "不合法的请求格式");
    }

    /**
     * HTTP参数不可读
     * @param ex
     * @return
     */
    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorResult handleHttpMessageNotReadableException(
            HttpMessageNotReadableException ex) {
        LOGGER.error("请求参数不可读", ex);
        return new ErrorResult("400", "请求参数不可读");
    }

    /**
     * 系统异常 预期以外异常
     * @param ex
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ErrorResult handleUnexpectedServer(Exception ex) {
        LOGGER.error("系统异常：", ex);
        return new ErrorResult("500", "系统发生异常，请联系管理员");
    }


}