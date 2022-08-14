package com.eamon.designpatternv2.Creational.AbstractFactory;

import com.eamon.designpatternv2.Creational.AbstractFactory.entity.Car;

public class Test {
    public static void main(String[] args) {
        IFactory iFactory = new SmallCarFactory();
        Car car = iFactory.creatCar(2);
        car.creat();
    }
}
