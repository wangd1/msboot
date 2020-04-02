package com.wd.springboot09swagger2.entity;

import java.io.Serializable;

/**
 * @author dwang
 * @create 2019-12-16 15:13
 */
public class ResponseBean {

    private Serializable body;

    private boolean hasError;

    private String errorMsg;

    public ResponseBean(){

    }

    public ResponseBean(Serializable body, boolean hasError, String errorMsg) {
        this.body = body;
        this.hasError = hasError;
        this.errorMsg = errorMsg;
    }
    public static ResponseBean paramError(String errorMsg){
        ResponseBeanBuilder builder = new ResponseBeanBuilder();
        return builder.body("").errorMsg(errorMsg)
                .hasError(true).builder();
    }
    public static ResponseBean failure(BaseMsg body){
        ResponseBeanBuilder builder = new ResponseBeanBuilder();
        return builder.body(body).errorMsg("")
                .hasError(false).builder();
    }

    public static ResponseBean ok(Serializable body){
        ResponseBeanBuilder builder = new ResponseBeanBuilder();

        return builder.body(BaseMsg.success(body)).errorMsg("")
                .hasError(false).builder();
    }


    public Serializable getBody() {
        return body;
    }

    public void setBody(BaseMsg body) {
        this.body = body;
    }

    public boolean isHasError() {
        return hasError;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}

