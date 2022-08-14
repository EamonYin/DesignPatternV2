package com.eamon.designpatternv2.Creational.AbstractFactory;

import com.eamon.designpatternv2.Creational.AbstractFactory.entity.Car;
import com.eamon.designpatternv2.Creational.AbstractFactory.entity.GCSmallCar;
import com.eamon.designpatternv2.Creational.AbstractFactory.entity.HZSmallCar;

public class SmallCarFactory implements IFactory{

    @Override
    public Car creatCar(Integer flg) {
        switch (flg){
            case 1:return new GCSmallCar();
            case 2:return new HZSmallCar();
            default:return new GCSmallCar();
        }
    }
}
