package com.eamon.designpatternv2.Structural.Composite;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Work zs = new Employee("张三");
        zs.doWork();
        Work ls = new Employee("李四");
        ls.doWork();
        ArrayList<Work> employees = new ArrayList<>();
        employees.add(zs);
        employees.add(ls);
        Manager lfc = new Manager("李发财", employees);
        lfc.doWork();
    }
}
