package com.eamon.designpatternv2.Behavior.State;

public class Vip implements IUser {
    @Override
    public void buy(Double price) {
        System.out.println("会员价格：" + price * 0.85);
    }
}
