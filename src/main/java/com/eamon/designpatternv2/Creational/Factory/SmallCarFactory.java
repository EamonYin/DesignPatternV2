package com.eamon.designpatternv2.Creational.Factory;

import com.eamon.designpatternv2.Creational.Factory.entity.Car;
import com.eamon.designpatternv2.Creational.Factory.entity.SmallCar;

public class SmallCarFactory {
    public Car creatCar(Integer box) {
        if (box != null) {
            return new SmallCar(box);
        }
        return new SmallCar();
    }
}
