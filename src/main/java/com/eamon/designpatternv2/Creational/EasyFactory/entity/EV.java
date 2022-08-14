package com.eamon.designpatternv2.Creational.EasyFactory.entity;

/**
 * 电动汽车
 */
public class EV implements Car{
    @Override
    public void creat() {
        System.out.println("造一辆电动汽车");
    }
}
