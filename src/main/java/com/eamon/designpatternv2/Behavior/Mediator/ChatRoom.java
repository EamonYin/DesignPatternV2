package com.eamon.designpatternv2.Behavior.Mediator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChatRoom implements Mediator {

    private List<User> users = new ArrayList();


    @Override
    public void register(User user) {
        users.add(user);
    }

    @Override
    public void chatTo(User user) {
        // 打乱users顺序
        Collections.shuffle(users);
        // 每次随机匹配
        for (User u : users) {
            if (user.getSex() != u.getSex()) {
                System.out.println("[" + user.nickName + "]---与---" + "[" + u.nickName + "]连线……");
                return;
            }
        }
    }
}
