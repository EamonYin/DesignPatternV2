package com.eamon.designpatternv2.Structural.Facade;

public class DepositCard {

    public static Integer balance = 1;

    public void useDepositCard(){
        System.out.println("通过借记卡消费");
    }

    public static Integer getBalance() {
        return balance;
    }
}
