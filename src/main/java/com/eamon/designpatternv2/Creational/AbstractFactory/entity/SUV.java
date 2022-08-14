package com.eamon.designpatternv2.Creational.AbstractFactory.entity;

public class SUV implements Car{
    @Override
    public void creat() {
        System.out.println("造一台SUV");
    }
}
