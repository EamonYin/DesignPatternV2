package com.eamon.designpatternv2.Behavior.State;

public class Normal implements IUser {

    @Override
    public void buy(Double price) {
        System.out.println("非会员价格：" + price);
    }
}
