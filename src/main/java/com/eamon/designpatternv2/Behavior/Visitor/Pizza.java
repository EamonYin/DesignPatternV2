package com.eamon.designpatternv2.Behavior.Visitor;

public class Pizza implements Menu {
    @Override
    public String getName() {
        return "披萨";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.choose(this);
    }
}
