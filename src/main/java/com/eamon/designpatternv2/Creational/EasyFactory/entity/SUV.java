package com.eamon.designpatternv2.Creational.EasyFactory.entity;

/**
 * 越野车
 */
public class SUV implements Car{
    @Override
    public void creat() {
        System.out.println("造一辆越野车");
    }
}
