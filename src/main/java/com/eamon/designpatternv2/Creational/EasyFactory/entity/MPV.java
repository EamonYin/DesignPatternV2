package com.eamon.designpatternv2.Creational.EasyFactory.entity;

/**
 * 旅行轿车
 */
public class MPV implements Car{
    @Override
    public void creat() {
        System.out.println("造一辆旅行轿车");
    }
}
