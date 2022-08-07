package com.eamon.designpatternv2.SOLID.InterfaceSegregation;

import com.eamon.designpatternv2.SOLID.InterfaceSegregation.Inter.GenericInterface;
import com.eamon.designpatternv2.SOLID.InterfaceSegregation.Inter.PersonInterface;

public class Programmer implements GenericInterface, PersonInterface {

    @Override
    public void eat() {
        System.out.println("人类吃饭");
    }

    @Override
    public void programming() {
        System.out.println("人类编程");
    }

    @Override
    public void drive() {
        System.out.println("人类驾驶汽车");
    }
}
