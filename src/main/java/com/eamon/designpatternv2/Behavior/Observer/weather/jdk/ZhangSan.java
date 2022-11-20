package com.eamon.designpatternv2.Behavior.Observer.weather.jdk;

import java.util.Observable;
import java.util.Observer;

public class ZhangSan implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        WeatherStation weatherStation = (WeatherStation) o;
        if(weatherStation.getTemperature()<0){
            System.out.println("张三穿上了羽绒服");
        }
    }
}
