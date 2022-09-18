package com.eamon.designpatternv2.Behavior.ChainOfResponsibility;

/**
 * 中级程序员
 */
public class Intermediate extends ChainHandler{
    @Override
    public void solveBugs(Integer level) {
        if(level<=3){
            System.out.println("中级解决了问题！");
        }else {
            next.solveBugs(level);
        }
    }
}
