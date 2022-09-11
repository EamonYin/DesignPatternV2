package com.eamon.designpatternv2.Structural.Flyweight;

public abstract class Bike {
    //共享的内部状态
    public Integer isBook = 0;

    abstract void book(String userName);

    abstract void back();

    public Integer getState() {
        return isBook;
    }
}
