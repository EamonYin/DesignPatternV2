package com.eamon.designpatternv2.Behavior.Observer.weather;

public class ZhangSan implements Observer{
    WeatherStation weatherStation;

    public ZhangSan(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        if(weatherStation.getTemperature()<0){
            System.out.println("张三穿上了羽绒服");
        }
    }
}
