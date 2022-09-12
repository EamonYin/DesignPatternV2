package com.eamon.designpatternv2.Structural.Proxy;

import org.springframework.util.StringUtils;

public class HttpProxyV2 implements IHttp {
    public final IHttp http;

    // 无参构造函数通过反射创建Http对象
    public HttpProxyV2(String className) {
        try {
            if (className.equals("csdn")) {
                this.http = (IHttp) this.getClass()
                        .getClassLoader()
                        .loadClass("com.eamon.designpatternv2.Structural.Proxy.Http")
                        .newInstance();
            } else {
                this.http = (IHttp) this.getClass()
                        .getClassLoader()
                        .loadClass("com.eamon.designpatternv2.Structural.Proxy.HttpV2")
                        .newInstance();
            }
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
