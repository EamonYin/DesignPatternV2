package com.eamon.designpatternv2.Behavior.ChainOfResponsibility;

/**
 * 高级程序员
 */
public class Senior extends ChainHandler {
    @Override
    public void solveBugs(Integer level) {
        System.out.println("高级级解决了问题！");
    }
}
