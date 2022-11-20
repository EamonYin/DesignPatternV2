package com.eamon.designpatternv2.Behavior.Observer.weather.pushModel;

public class LiSi implements Observer {
    @Override
    public void update(Weather weather) {
        if (weather.getDampness() > 80) {
            System.out.println("李四开启了除湿器");
        }
    }
}
