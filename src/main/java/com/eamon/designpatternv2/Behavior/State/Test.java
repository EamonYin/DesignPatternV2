package com.eamon.designpatternv2.Behavior.State;

public class Test {
    public static void main(String[] args) {
        // 商品原价
        Double price = 175.99;
        Client client = new Client();
        // 顾客注册vip
        client.register(new Vip());
        client.shopping(price);

        // 顾客升级为超级会员
        client.register(new VipPlus());
        client.shopping(price);

        // 顾客会员到期
        client.register(new Normal());
        client.shopping(price);
    }
}
