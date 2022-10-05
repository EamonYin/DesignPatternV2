package com.eamon.designpatternv2.Behavior.Observer;

public class Test {
    public static void main(String[] args) {
        Thief zhanSan = new ZhanSan();
        zhanSan.Steal(new Sir());
        zhanSan.Steal(new BuTou());

        zhanSan.notifyPolice();
    }
}
