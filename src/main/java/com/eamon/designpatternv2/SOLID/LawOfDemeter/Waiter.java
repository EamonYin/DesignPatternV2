package com.eamon.designpatternv2.SOLID.LawOfDemeter;

public class Waiter {
    public Chef notice(String tableNumber) {
        System.out.println("服务员接到" + tableNumber + "号桌点菜");
        Chef chef = new Chef();
        return chef;
    }

    public void passDish(String tableNumbe, String dishName) {
        String cooking = notice(tableNumbe).cooking(dishName);
        System.out.println(cooking);
        System.out.println("服务员传菜");
    }
}
