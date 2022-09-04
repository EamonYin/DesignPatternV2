package com.eamon.designpatternv2.Structural.Decorator;

public class Dumbphone implements Phone{
    @Override
    public void doSomething() {
        System.out.println("老年机功能:");
        System.out.println("打电话");
        System.out.println("发短信");
    }
}
