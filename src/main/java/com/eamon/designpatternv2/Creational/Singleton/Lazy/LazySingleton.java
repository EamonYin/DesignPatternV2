package com.eamon.designpatternv2.Creational.Singleton.Lazy;

/**
 * 线程不安全
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            instance = new LazySingleton();
        }
        return instance;
    }

    public void showMsg() {
        System.out.println("This is LazySingleton!");
    }
}
