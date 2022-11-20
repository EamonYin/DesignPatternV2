package com.eamon.designpatternv2.Behavior.Observer.weather.jdk;

import java.util.Observable;
import java.util.Observer;

public class LiSi implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        WeatherStation weatherStation = (WeatherStation) o;
        if(weatherStation.getDampness()>80){
            System.out.println("李四开启了除湿器");
        }
    }
}
