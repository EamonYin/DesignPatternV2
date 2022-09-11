package com.eamon.designpatternv2.Structural.Facade;

public class Test {
    public static void main(String[] args) {
        AliPay aliPay = new AliPay();
        aliPay.toPay(10499);
    }
}
