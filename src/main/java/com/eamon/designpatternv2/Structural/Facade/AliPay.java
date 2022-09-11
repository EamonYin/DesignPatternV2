package com.eamon.designpatternv2.Structural.Facade;

public class AliPay {

    CreditCard creditCard;
    DepositCard depositCard;
    YuEbao yuEbao;

    public void toPay(Integer price) {
        // 按客户设置的消费顺序，找到余额足够的支付方式进行消费
        if (yuEbao.getBalance() > price) {
            yuEbao.useYuEbao();
        } else if (creditCard.getBalance() > price) {
            creditCard.useCreditCard();
        } else if (depositCard.getBalance() > price) {
            depositCard.useDepositCard();
        } else {
            System.out.println("你买不起！");
        }
    }

    public AliPay() {
    }
}
