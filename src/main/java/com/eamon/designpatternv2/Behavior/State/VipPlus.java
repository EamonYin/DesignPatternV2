package com.eamon.designpatternv2.Behavior.State;

public class VipPlus implements IUser {
    @Override
    public void buy(Double price) {
        System.out.println("超级会员价格：" + price * 0.5);
    }
}
