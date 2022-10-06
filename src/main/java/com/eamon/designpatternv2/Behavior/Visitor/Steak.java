package com.eamon.designpatternv2.Behavior.Visitor;

public class Steak implements Menu{
    @Override
    public String getName() {
        return "牛排";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.choose(this);
    }
}
