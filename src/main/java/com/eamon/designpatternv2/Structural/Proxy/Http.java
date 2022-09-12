package com.eamon.designpatternv2.Structural.Proxy;

public class Http implements IHttp {

    @Override
    public void visit() {
        System.out.println("https://www.csdn.net/");
    }
}
