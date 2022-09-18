package com.eamon.designpatternv2.Behavior.ChainOfResponsibility;

abstract class ChainHandler {
    protected ChainHandler next;
    public void setNext(ChainHandler chainHandler){
        this.next = chainHandler;
    }
    public abstract void solveBugs(Integer level);
}
