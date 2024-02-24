package com.xs.xsapiinterface.aop;

import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 调用次数切面
 */
@RestControllerAdvice
public class InvokeCountAop {
    // 伪代码
    //定义切面触发的时机（什么时候执行方法）controller接口的方法执行成功后，执行下述方法
    public void doInvoke() {

    }
}
