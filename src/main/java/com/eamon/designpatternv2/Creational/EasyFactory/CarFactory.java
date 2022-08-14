package com.eamon.designpatternv2.Creational.EasyFactory;

import com.eamon.designpatternv2.Creational.EasyFactory.entity.*;

public class CarFactory {
    public Car creatCar(String name) throws IllegalAccessException {
        switch (name) {
            case "Saloon":
                return new Saloon();
            case "EV":
                return new EV();
            case "MPV":
                return new MPV();
            case "SUV":
                return new SUV();
            default:
                throw new IllegalAccessException("目前没有" + name + "车型");
        }
    }
}
