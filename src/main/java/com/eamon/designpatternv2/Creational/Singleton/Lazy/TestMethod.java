package com.eamon.designpatternv2.Creational.Singleton.Lazy;

import org.junit.Test;

public class TestMethod {
    @Test
    public void Test1() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(LazySingleton.getInstance());
            }
        }).start();
        System.out.println(LazySingleton.getInstance());
    }

    @Test
    public void Test2() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(LazySingletonV2.getInstance());
            }
        }).start();
        System.out.println(LazySingletonV2.getInstance());
    }

    @Test
    public void Test3() {
        String msg = LazySingletonV3.INSTANCE.getMsg();
        System.out.println(msg);
    }

    @Test
    public void Test4() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(LazySingletonV4.getInstance());
            }
        }).start();
        System.out.println(LazySingletonV4.getInstance());
    }

}
