package com.eamon.designpatternv2.Behavior.Observer.weather.pullModel;

public interface WeatherSubject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
