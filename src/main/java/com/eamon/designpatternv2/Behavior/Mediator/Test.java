package com.eamon.designpatternv2.Behavior.Mediator;

public class Test {
    public static void main(String[] args) {

        ChatRoom chatRoom = new ChatRoom();

        User 白月光 = new User(User.Sex.FEMALE, 18, "白月光",chatRoom);
        User 万千少女的梦 = new User(User.Sex.MALE, 18, "万千少女的梦",chatRoom);
        User 甜心超甜 = new User(User.Sex.FEMALE, 22, "甜心超甜",chatRoom);
        User 我是小学生 = new User(User.Sex.FEMALE, 25, "我是小学生",chatRoom);
        User 码农 = new User(User.Sex.MALE, 30, "码农",chatRoom);

        chatRoom.chatTo(码农);

    }
}
