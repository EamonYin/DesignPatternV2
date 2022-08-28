package com.eamon.designpatternv2.Structural.Bridge;

import lombok.Data;

@Data
public class ChickenLegRice implements Rice {

    private String name = "鸡腿饭";

    @Override
    public void rice(String drink) {
        System.out.println("您选择的套餐包含：" + name + " 和 " + drink);
    }
}
