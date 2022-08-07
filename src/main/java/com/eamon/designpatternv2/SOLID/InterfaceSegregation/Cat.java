package com.eamon.designpatternv2.SOLID.InterfaceSegregation;

import com.eamon.designpatternv2.SOLID.InterfaceSegregation.Inter.AnimalInterface;
import com.eamon.designpatternv2.SOLID.InterfaceSegregation.Inter.GenericInterface;

public class Cat implements GenericInterface, AnimalInterface {
    @Override
    public void prey() {
        System.out.println("猫捉老鼠");
    }

    @Override
    public void eat() {
        System.out.println("猫吃老鼠");
    }
}
