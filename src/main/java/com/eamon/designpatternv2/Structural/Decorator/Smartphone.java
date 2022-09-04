package com.eamon.designpatternv2.Structural.Decorator;

public class Smartphone implements PhoneDecorator {

    private Phone phone;

    public Smartphone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void doSomething() {
        phone.doSomething();
    }

    @Override
    public void doOtherthing() {
        phone.doSomething();
        System.out.println("智能手机通过装饰器添加了:");
        System.out.println("拍照");
        System.out.println("NFC");
    }
}
