package com.eamon.designpatternv2.Behavior.State;

public class Client {
    private IUser state;

    // 切换身份
    public void register(IUser iUser){
        this.state = iUser;
    }
    // 顾客以不同身份购物的价格
    public void shopping(Double price){
        state.buy(price);
    }
}
