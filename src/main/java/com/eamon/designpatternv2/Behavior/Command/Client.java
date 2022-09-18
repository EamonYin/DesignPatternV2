package com.eamon.designpatternv2.Behavior.Command;


/**
 * 测试客户类
 */
public class Client {
    public static void main(String[] args) {
        InvokerWaitor waiter = new InvokerWaitor();
        ReceiverChef chef = new ReceiverChef();
        // 顾客1创建订单
        Order order1 = new Order();
        order1.setOrderNum(1001);
        order1.setOrderFrom("宫保鸡丁",1);
        order1.setOrderFrom("米饭",2);
        Command orderCommand1 = new OrderCommand(order1, chef);

        // 顾客2创建订单
        Order order2 = new Order();
        order2.setOrderNum(1002);
        order2.setOrderFrom("佛跳墙",6);
        order2.setOrderFrom("帝王蟹",1);
        order2.setOrderFrom("奥龙",2);
        order2.setOrderFrom("茅台",2);
        Command orderCommand2 = new OrderCommand(order2, chef);

        // 服务员点单
        waiter.setCommands(orderCommand1);
        waiter.setCommands(orderCommand2);

        // 服务员通知厨师做菜
        waiter.notifyChef();
    }
}
