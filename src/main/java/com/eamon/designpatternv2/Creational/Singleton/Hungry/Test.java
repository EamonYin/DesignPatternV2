package com.eamon.designpatternv2.Creational.Singleton.Hungry;

public class Test {
    public static void main(String[] args) {
        HungrySingleton instance = HungrySingleton.getInstance();
        instance.showMsg();
    }
}
