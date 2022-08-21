package com.eamon.designpatternv2.Creational.Singleton.Lazy;

/**
 * 利用枚举
 */
public enum LazySingletonV3 {

    INSTANCE;

    private String Msg = "This is LazySingletonV3!";

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }
}
