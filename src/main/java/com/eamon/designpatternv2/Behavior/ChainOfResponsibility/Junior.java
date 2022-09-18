package com.eamon.designpatternv2.Behavior.ChainOfResponsibility;

/**
 * 初级程序员
 */
public class Junior extends ChainHandler{

    @Override
    public void solveBugs(Integer level) {
        if(level<=1){
            System.out.println("初级解决了问题！");
        }else {
            next.solveBugs(level);
        }
    }
}
