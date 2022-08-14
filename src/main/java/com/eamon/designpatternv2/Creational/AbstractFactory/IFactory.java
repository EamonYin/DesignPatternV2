package com.eamon.designpatternv2.Creational.AbstractFactory;

import com.eamon.designpatternv2.Creational.AbstractFactory.entity.Car;

public interface IFactory {
    Car creatCar(Integer flg);
}
