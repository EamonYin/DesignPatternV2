package com.eamon.designpatternv2.Behavior.Observer.weather.jdk;

import java.util.Observable;

public class WeatherStation extends Observable {
    int temperature = 0;
    int dampness = 0;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        setChanged();
        notifyObservers();
    }

    public int getDampness() {
        return dampness;
    }

    public void setDampness(int dampness) {
        this.dampness = dampness;
        setChanged();
        notifyObservers();
    }
}
