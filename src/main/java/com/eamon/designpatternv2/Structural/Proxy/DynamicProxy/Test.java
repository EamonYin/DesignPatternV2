package com.eamon.designpatternv2.Structural.Proxy.DynamicProxy;

import com.eamon.designpatternv2.Structural.Proxy.IHttp;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {

        IHttp csdn = (IHttp) Proxy.newProxyInstance(Test.class.getClassLoader(),
                new Class[]{IHttp.class},
                new HttpProxyV3(new Csdn()));
        csdn.visit();

        IHttp baidu = (IHttp) Proxy.newProxyInstance(Test.class.getClassLoader(),
                Baidu.class.getInterfaces(),
                new HttpProxyV3(new Baidu()));
        baidu.visit();
    }
}
