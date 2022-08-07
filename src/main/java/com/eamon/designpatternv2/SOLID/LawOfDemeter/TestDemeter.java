package com.eamon.designpatternv2.SOLID.LawOfDemeter;

import org.junit.Test;

public class TestDemeter {
    @Test
    public void test() {
        Diner diner = new Diner();
        Waiter waiter = new Waiter();
        diner.order(waiter, "11", "宫保鸡丁");
    }
}
