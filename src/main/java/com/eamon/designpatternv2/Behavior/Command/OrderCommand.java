package com.eamon.designpatternv2.Behavior.Command;

import java.util.Iterator;
import java.util.Map;

/**
 * 具体命令类
 */
public class OrderCommand implements Command {

    private Order order;

    private ReceiverChef chef;

    public OrderCommand(Order order, ReceiverChef chef) {
        this.order = order;
        this.chef = chef;
    }

    @Override
    public void execute() {
        System.out.println("订单号" + order.getOrderNum() + "出餐:");
        Map<String, Integer> orderFrom = order.getOrderFrom();
        Iterator<Map.Entry<String, Integer>> iterator = orderFrom.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            // 厨师按照订单依次烹饪菜品
            chef.cook(next.getKey(), next.getValue());
        }
        System.out.println("Chef 通知 Waitor 订单【" + order.getOrderNum() + "】出菜～");
        System.out.println("=======================================================");
    }
}
