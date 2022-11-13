package com.eamon.designpatternv2.Structural.Proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HttpProxyV3 implements InvocationHandler {

    Object realSubject;

    public HttpProxyV3(Object realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("---proxy start!---");
        Object invoke = method.invoke(realSubject, args);
        System.out.println("---代理了" + realSubject.getClass().getSimpleName()+"---");
        return invoke;
    }
}
