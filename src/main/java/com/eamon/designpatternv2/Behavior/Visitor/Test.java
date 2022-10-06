package com.eamon.designpatternv2.Behavior.Visitor;

import com.eamon.designpatternv2.Structural.Adapter.Adapter;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(new Steak());
        menus.add(new Pizza());

        XiaoMing xiaoMing = new XiaoMing();

        for (Menu menu: menus) {
            menu.accept(xiaoMing);
        }

    }
}
