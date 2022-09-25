package com.eamon.designpatternv2.Behavior.Mediator;

import lombok.Data;

@Data
public class User {
    protected Sex sex;
    protected Integer age;
    protected String nickName;

    private ChatRoom chatRoom;

    public User(Sex sex, Integer age, String nickName, ChatRoom chatRoom) {
        this.sex = sex;
        this.age = age;
        this.nickName = nickName;
        this.chatRoom = chatRoom;
        chatRoom.register(this);
    }

    public void chat() {
        chatRoom.chatTo(this);
    }

    enum Sex {
        MALE, FEMALE;
    }
}
