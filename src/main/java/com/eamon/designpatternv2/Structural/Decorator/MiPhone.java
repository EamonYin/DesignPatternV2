package com.eamon.designpatternv2.Structural.Decorator;

public class MiPhone implements PhoneDecorator {

    private Phone phone;

    public MiPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void doSomething() {
        phone.doSomething();
    }

    @Override
    public void doOtherthing() {
        phone.doSomething();
        System.out.println("MiPhone通过装饰器添加了:");
        System.out.println("拍照");
        System.out.println("NFC");
        System.out.println("红外遥控器");
    }
}
