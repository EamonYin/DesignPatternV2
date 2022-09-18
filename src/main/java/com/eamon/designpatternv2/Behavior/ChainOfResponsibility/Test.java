package com.eamon.designpatternv2.Behavior.ChainOfResponsibility;

public class Test {
    public static void main(String[] args) {
        // 创建初级、中级、高级程序员对象
        ChainHandler junior = new Junior();
        ChainHandler intermediate = new Intermediate();
        ChainHandler senior = new Senior();
        // 设置责任链
        junior.setNext(intermediate);
        intermediate.setNext(senior);
        // 将问题给到初级程序员，由他处理
        junior.solveBugs(15);
    }
}
