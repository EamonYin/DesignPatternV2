package com.eamon.designpatternv2.Structural.Proxy;

public class Test {
    public static void main(String[] args) {
//        IHttp http = new Http();
//        HttpProxy httpProxy = new HttpProxy(http);
//        httpProxy.visit();
        System.out.println("--------------------------");
        HttpProxy httpProxy1 = new HttpProxy();
        httpProxy1.visit();
        System.out.println("--------------------------");
        HttpProxyV2 httpProxy2 = new HttpProxyV2("baidu");
        httpProxy2.visit();
    }
}
