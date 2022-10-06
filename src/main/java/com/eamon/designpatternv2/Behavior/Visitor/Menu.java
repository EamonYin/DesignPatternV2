package com.eamon.designpatternv2.Behavior.Visitor;

public interface Menu {
    String getName();
    void accept(Visitor visitor);
}
