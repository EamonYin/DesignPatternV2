package com.eamon.designpatternv2.Behavior.Visitor;

public interface Visitor {
    void choose(Steak steak);
    void choose(Pizza pizza);
}
