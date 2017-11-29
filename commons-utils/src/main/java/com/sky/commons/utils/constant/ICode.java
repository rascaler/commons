package com.sky.commons.utils.constant;

/**
 * 错误码定义接口,实现该接口定义错误码类型
 * #1. 按枚举继承方法模式
 * Created by wurenqing on 3/17/17.
 */
public interface ICode {
    /**
     * 错误码
     * @return
     */
    String code();

    /**
     * 错误码说明
     * @return
     */
    String message();
}
