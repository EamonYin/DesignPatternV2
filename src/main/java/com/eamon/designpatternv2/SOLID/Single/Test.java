package com.eamon.designpatternv2.SOLID.Single;

/**
 * @Author: Eamon
 * @Date: 2022/5/10 14:49
 */
public class Test {
    public static void main(String[] args) {

        ElectricPower electricPower = new ElectricPower();
        electricPower.power("电动车");

        OilPower oilPower = new OilPower();
        oilPower.power("摩托车");
    }
}
