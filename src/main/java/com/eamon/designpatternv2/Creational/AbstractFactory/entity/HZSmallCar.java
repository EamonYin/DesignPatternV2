package com.eamon.designpatternv2.Creational.AbstractFactory.entity;

public class HZSmallCar extends SmallCar{
    @Override
    public void creat() {
        System.out.println("造一台" + this.engine() + "+" + this.wheel() + "的合资车");
    }

    @Override
    String engine() {
        return "合资发动机";
    }

    @Override
    String wheel() {
        return "合资轮胎";
    }
}
