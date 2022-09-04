package com.eamon.designpatternv2.Structural.Composite;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.List;

public class Manager implements Work {

    public String name;

    public List<Work> employees;

    public Manager(String name, List<Work> employees) {
        this.name = name;
        this.employees = employees;
    }

    @Override
    public void doWork() {
        System.out.println("我是" + name + "我的工作是统计工作：");
        for (Work employee :
                employees) {
            System.out.print("-");
            employee.doWork();
        }
    }
}
