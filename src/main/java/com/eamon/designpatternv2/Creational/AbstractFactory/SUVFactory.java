package com.eamon.designpatternv2.Creational.AbstractFactory;

import com.eamon.designpatternv2.Creational.AbstractFactory.entity.Car;
import com.eamon.designpatternv2.Creational.AbstractFactory.entity.SUV;

public class SUVFactory implements IFactory{
    @Override
    public Car creatCar(Integer flg) {
        return new SUV();
    }
}
