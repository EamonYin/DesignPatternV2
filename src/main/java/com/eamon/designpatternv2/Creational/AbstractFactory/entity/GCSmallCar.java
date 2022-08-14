package com.eamon.designpatternv2.Creational.AbstractFactory.entity;

/**
 * 国产汽车
 */
public class GCSmallCar extends SmallCar {
    @Override
    public void creat() {
        System.out.println("造一台" + this.engine() + "+" + this.wheel() + "的国产车");
    }

    @Override
    String engine() {
        return "国产发动机";
    }

    @Override
    String wheel() {
        return "国产轮胎";
    }
}
