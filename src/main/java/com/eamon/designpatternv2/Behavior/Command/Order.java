package com.eamon.designpatternv2.Behavior.Command;

import java.util.HashMap;
import java.util.Map;

/**
 * 订单实体类
 */
public class Order {
    // 订单号
    private Integer orderNum;
    // 菜名:份数
    private Map<String,Integer> orderFrom = new HashMap<String, Integer>();

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Map<String, Integer> getOrderFrom() {
        return orderFrom;
    }

    public void setOrderFrom(String name,Integer num) {
       orderFrom.put(name,num);
    }
}
