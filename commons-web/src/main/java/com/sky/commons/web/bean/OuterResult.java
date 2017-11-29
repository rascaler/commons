package com.sky.commons.web.bean;

/**
 * Created by wurenqing on 2017/3/20.
 */
public class OuterResult {
    private String code = "1000";
    private String msg = "操作成功";
    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public OuterResult(String message) {
        this.setCode("1001");
        this.setMsg(message);
    }


    public OuterResult(String code, String message) {
        this.setCode(code);
        this.setMsg(message);
    }

    public OuterResult() {
    }

    public static OuterResult newInstance() {
        return new OuterResult();
    }
}
