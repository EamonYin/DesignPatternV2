package com.eamon.designpatternv2.Structural.Composite;

import lombok.Data;

public class Employee implements Work {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println("我是" + name + "我的工作是搬砖");
    }
}
