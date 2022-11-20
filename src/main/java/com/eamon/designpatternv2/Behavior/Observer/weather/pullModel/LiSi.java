package com.eamon.designpatternv2.Behavior.Observer.weather.pullModel;

public class LiSi implements Observer {
    @Override
    public void update(WeatherStation weatherStation) {
        if (weatherStation.getDampness() > 80) {
            System.out.println("李四开启了除湿器");
        }
    }
}
