package com.eamon.designpatternv2.Creational.Factory.entity;

public class SmallCar implements Car {

    public SmallCar(Integer box) {
        this.creat(box);
    }

    public SmallCar() {
        this.creat();
    }

    @Override
    public void creat() {
        System.out.println("造一辆标配小轿车");
    }

    public void creat(Integer box) {
        System.out.println("造一辆" + box + "厢小轿车");
    }
}
