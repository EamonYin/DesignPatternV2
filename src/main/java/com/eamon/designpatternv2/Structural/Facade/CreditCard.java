package com.eamon.designpatternv2.Structural.Facade;

public class CreditCard {

    public static Integer balance = 3000;

    public void useCreditCard(){
        System.out.println("通过信用卡消费");
    }

    public static Integer getBalance() {
        return balance;
    }
}
