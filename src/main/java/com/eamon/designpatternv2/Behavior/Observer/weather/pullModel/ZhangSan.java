package com.eamon.designpatternv2.Behavior.Observer.weather.pullModel;

public class ZhangSan implements Observer {
    @Override
    public void update(WeatherStation weatherStation) {
        if(weatherStation.getTemperature()<0){
            System.out.println("张三穿上了羽绒服");
        }
    }
}
