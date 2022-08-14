package com.eamon.designpatternv2.Creational.EasyFactory;

import com.eamon.designpatternv2.Creational.EasyFactory.entity.Car;

public class Test {
    public static void main(String[] args) throws IllegalAccessException {
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.creatCar("SUV");
        car.creat();
    }
}
