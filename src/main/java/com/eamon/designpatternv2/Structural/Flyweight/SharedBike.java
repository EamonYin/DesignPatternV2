package com.eamon.designpatternv2.Structural.Flyweight;

public class SharedBike extends Bike {

    private Integer id;

    public SharedBike(Integer id) {
        this.id = id;
    }

    @Override
    void book(String userName) {
        isBook = 1;
        System.out.println(userName + "正在使用" + id + "号单车");
    }

    @Override
    void back() {
        isBook = 0;
    }
}
