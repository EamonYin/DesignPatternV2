package com.eamon.designpatternv2.Structural.Bridge;

public class PorkChop implements Rice{
    private String name = "猪排饭";

    @Override
    public void rice(String drink) {
        System.out.println("您选择的套餐包含：" + name + " 和 " + drink);
    }
}
