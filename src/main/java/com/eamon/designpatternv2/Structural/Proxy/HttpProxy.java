package com.eamon.designpatternv2.Structural.Proxy;

public class HttpProxy implements IHttp {

    public final IHttp http;

    public HttpProxy(IHttp instance) {
        this.http = instance;
    }

    // 无参构造函数通过反射创建Http对象
    public HttpProxy() {
        try {
            this.http = (Http) this.getClass()
                    .getClassLoader()
                    .loadClass("com.eamon.designpatternv2.Structural.Proxy.Http")
                    .newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void request() {
        System.out.println("准备请求……");
    }

    public void success() {
        System.out.println("连接成功！");
    }

    @Override
    public void visit() {
        request();
        http.visit();
        success();
    }
}
