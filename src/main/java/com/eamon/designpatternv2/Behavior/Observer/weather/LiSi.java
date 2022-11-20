package com.eamon.designpatternv2.Behavior.Observer.weather;

public class LiSi implements Observer {
    WeatherStation weatherStation;

    public LiSi(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        if (weatherStation.getDampness() > 80) {
            System.out.println("李四开启了除湿器");
        }
    }
}
