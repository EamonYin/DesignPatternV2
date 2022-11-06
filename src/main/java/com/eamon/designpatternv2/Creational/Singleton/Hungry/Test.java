package com.eamon.designpatternv2.Creational.Singleton.Hungry;

public class Test {
    public static void main(String[] args) {
        HungrySingleton instance = HungrySingleton.getInstance();
        System.out.println(instance);
        instance.showMsg();

        HungrySingleton instance2 = HungrySingleton.getInstance();
        System.out.println(instance2);
        instance2.showMsg();
    }
}
