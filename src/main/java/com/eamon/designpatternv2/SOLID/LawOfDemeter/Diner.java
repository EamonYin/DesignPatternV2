package com.eamon.designpatternv2.SOLID.LawOfDemeter;

/**
 * 食客吃饭，不关心如何制作，所以：
 * 食客和服务员是朋友，和厨师是陌生人
 */
public class Diner {
    public void order(Waiter waiter, String tableNumber, String dishName) {
        waiter.passDish(tableNumber, dishName);
    }
}
