package com.eamon.designpatternv2.Creational.Singleton.Lazy;

/**
 * 饿汉，懒汉结合
 */
public class LazySingletonV4 {

    public static class InnerHolder{
        //java虚拟机创建，保证单线程执行
        //只有使用到这个内部类的时候才会创建
        private static LazySingletonV4 instance = new LazySingletonV4();
    }

    private LazySingletonV4() {
        System.out.println("LazySingletonV4"+"  create");
    }

    public static LazySingletonV4 getInstance() {
        System.out.println("LazySingletonV4"+"  getInstance");
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        return InnerHolder.instance;
    }

    public void showMsg() {
        System.out.println("This is LazySingleton!");
    }
}
