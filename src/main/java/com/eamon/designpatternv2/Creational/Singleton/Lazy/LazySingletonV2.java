package com.eamon.designpatternv2.Creational.Singleton.Lazy;

/**
 * 双检锁方式
 * 线程安全
 */
public class LazySingletonV2 {
    private static LazySingletonV2 instance = null;

    private LazySingletonV2() {
    }

    public static LazySingletonV2 getInstance() {
        //如果instance不为null，无需抢锁，返回instance即可
        if (instance == null) {
            //避免多线程调用时，创建多个instance≈
            synchronized (LazySingletonV2.class) {
                try {
                    Thread.sleep(3000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                //抢到锁的线程判断是否为null
                if (instance == null) {
                    instance = new LazySingletonV2();
                }
            }
        }
        return instance;
    }

    public void showMsg() {
        System.out.println("This is LazySingletonV2!");
    }
}
