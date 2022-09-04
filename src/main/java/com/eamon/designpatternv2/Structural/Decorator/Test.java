package com.eamon.designpatternv2.Structural.Decorator;

public class Test {
    public static void main(String[] args) {
        System.out.println("======智能手机=======");
        new Smartphone(new Dumbphone()).doOtherthing();
        System.out.println("======MiPhone=======");
        new MiPhone(new Dumbphone()).doOtherthing();
    }
}
