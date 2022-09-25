package com.eamon.designpatternv2.Behavior.Mediator;

public interface Mediator {
    // 注册为聊天室会员
    void register(User user);
    // 随机分配两个人匿名聊天
    void chatTo(User user);
}
