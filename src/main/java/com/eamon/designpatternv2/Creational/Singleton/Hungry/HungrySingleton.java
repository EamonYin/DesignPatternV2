package com.eamon.designpatternv2.Creational.Singleton.Hungry;

public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static synchronized HungrySingleton getInstance() {
        return instance;
    }

    public void showMsg(){
        System.out.println("This is HungrySingleton!");
    }
}
