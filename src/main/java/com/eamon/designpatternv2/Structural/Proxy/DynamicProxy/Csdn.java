package com.eamon.designpatternv2.Structural.Proxy.DynamicProxy;

import com.eamon.designpatternv2.Structural.Proxy.IHttp;

public class Csdn implements IHttp {
    @Override
    public void visit() {
        System.out.println("www.csdn.net");
    }
}
