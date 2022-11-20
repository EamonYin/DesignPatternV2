package com.eamon.designpatternv2.Behavior.Observer.weather.pushModel;

public class ZhangSan implements Observer {
    @Override
    public void update(Weather weather) {
        if(weather.getTemperature()<0){
            System.out.println("张三穿上了羽绒服");
        }
    }
}
