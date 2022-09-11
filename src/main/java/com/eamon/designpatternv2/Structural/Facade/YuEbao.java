package com.eamon.designpatternv2.Structural.Facade;

public class YuEbao {

    public static Integer balance = 10;

    public void useYuEbao(){
        System.out.println("通过余额宝消费");
    }

    public static Integer getBalance() {
        return balance;
    }
}
