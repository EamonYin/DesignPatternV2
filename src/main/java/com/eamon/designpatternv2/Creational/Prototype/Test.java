package com.eamon.designpatternv2.Creational.Prototype;

public class Test {
    public static void main(String[] args) {
        Car wuLing = new Car();
        wuLing.setName("五菱宏光");
        wuLing.setBox(2);
        wuLing.setPower("汽油");
        System.out.println("----------原始配置----------");
        wuLing.show();
        //通过clone方法创建的新对象
        Car clone = wuLing.clone();
        wuLing.setBox(3);
        //地址引用
        Car wuLing2 = wuLing;
        System.out.println("----------修改配置后wuLing----------");
        wuLing.show();
        System.out.println("----------原始配置后wuLing2----------");
        wuLing2.show();
        System.out.println("----------原始配置后clone----------");
        clone.show();
    }
}
