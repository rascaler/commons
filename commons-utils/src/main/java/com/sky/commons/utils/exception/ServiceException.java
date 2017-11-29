package com.sky.commons.utils.exception;

import com.sky.commons.utils.constant.BasicCode;
import com.sky.commons.utils.constant.ICode;

/**
 * 服务接口异常封装
 * 继承运行时异常RuntimeException,不强制调用方捕获,减少代码量
 * Created by wurenqing on 3/17/17.
 */
public class ServiceException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 2988464431836163074L;
    /*状态码*/
    private String code;
    /*状态码说明*/
    private String msg;

    /**
     * Constructs a new runtime exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     */
    public ServiceException(String code) {
        super(BasicCode.getMsg(code));
        this.code = code;
        this.msg = BasicCode.getMsg(code);
    }

    /**
     * 占位符 参数传递
     * %s%s   参数  可变字符
     *
     * @param code
     * @param args
     */
    public ServiceException(String code, String... args) {
        super(BasicCode.getMsg(code));
        this.code = code;
        this.msg = BasicCode.getMsg(code);
        if (args != null && args.length > 0) {
            this.msg = String.format(this.msg, args);
        }
    }

    public ServiceException(ICode code, String... args) {
        super(code.message());
        this.code = code.code();
        this.msg = code.message();
        if (args != null && args.length > 0) {
            this.msg = String.format(this.msg, args);
        }
    }


    public String getCode() {
        return code;
    }


    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "SPIException{" +
                "ecode=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
