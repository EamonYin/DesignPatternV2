package com.eamon.designpatternv2.Behavior.Observer.weather.pushModel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WeatherStation implements WeatherSubject {
    // 观察者列表
   List<Observer> observers = new ArrayList<>();
    // 温度
    private int temperature = 0;
    // 湿度
    private int dampness = 0;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(Weather weather) {
        for (Observer o :observers){
            o.update(weather);
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        Weather weather = new Weather();
        weather.setTemperature(temperature);
        notifyObserver(weather);
    }

    public void setDampness(int dampness) {
        this.dampness = dampness;
        Weather weather = new Weather();
        weather.setDampness(dampness);
        notifyObserver(weather);
    }
}
