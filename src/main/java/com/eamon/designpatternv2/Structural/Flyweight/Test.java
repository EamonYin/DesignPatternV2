package com.eamon.designpatternv2.Structural.Flyweight;

public class Test {
    public static void main(String[] args) {
        FlyweightFactory.getInstance().getBike().book("张三");
        Bike bike = FlyweightFactory.getInstance().getBike();
        bike.book("李四");
        bike.back();//李四还车了，所以赵五有可能还会借到1号车
        FlyweightFactory.getInstance().getBike().book("王五");
    }
}
