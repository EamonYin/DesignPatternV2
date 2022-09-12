package com.eamon.designpatternv2.Structural.Proxy;

public class HttpV2 implements IHttp {

    @Override
    public void visit() {
        System.out.println("https://www.baidu.com/");
    }
}
