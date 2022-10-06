package com.eamon.designpatternv2.Behavior.Visitor;

public class XiaoMing implements Visitor {
    @Override
    public void choose(Steak steak) {
        System.out.println("小名选择：" + steak.getName());
    }

    @Override
    public void choose(Pizza pizza) {
        System.out.println("小名不喜欢：" + pizza.getName());
    }
}
