package com.eamon.designpatternv2.Creational.Factory;

import com.eamon.designpatternv2.Creational.Factory.entity.Car;
import com.eamon.designpatternv2.Creational.Factory.entity.SUV;

public class SUVCarFactory {
    public Car creatCar(){
        return new SUV();
    }
}
