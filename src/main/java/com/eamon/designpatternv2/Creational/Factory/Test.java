package com.eamon.designpatternv2.Creational.Factory;

import com.eamon.designpatternv2.Creational.Factory.entity.Car;

public class Test {
    public static void main(String[] args) {
        SmallCarFactory smallCarFactory = new SmallCarFactory();
        Car car = smallCarFactory.creatCar(null);
        System.out.println(car);
    }
}
