package com.eamon.designpatternv2.Structural.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightFactory {

    private static FlyweightFactory instance = new FlyweightFactory();
    private List<SharedBike> pool = new ArrayList<>();

    //单例-懒汉模式
    public static FlyweightFactory getInstance() {
        return instance;
    }

    public FlyweightFactory() {
        for (int i = 0; i < 10; i++) {
            pool.add(new SharedBike(i));
        }
    }

    public SharedBike getBike() {
        for (SharedBike bike : pool) {
            if (bike.getState() != 1) {
                return bike;
            }
        }
        return null;
    }
}
