package com.eamon.designpatternv2.Creational.Singleton.Lazy;

import org.junit.Test;

public class TestMethod {
    @Test
    public void Test1() {
        LazySingleton instance = LazySingleton.getInstance();
        instance.showMsg();
    }

    @Test
    public void Test2() {
        String msg = LazySingletonV3.INSTANCE.getMsg();
        System.out.println(msg);
    }

}
