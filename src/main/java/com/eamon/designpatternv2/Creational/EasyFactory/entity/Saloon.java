package com.eamon.designpatternv2.Creational.EasyFactory.entity;

/**
 * 轿车
 */
public class Saloon implements Car{
    @Override
    public void creat() {
        System.out.println("造一辆轿车");
    }
}
