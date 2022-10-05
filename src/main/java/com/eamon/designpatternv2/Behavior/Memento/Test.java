package com.eamon.designpatternv2.Behavior.Memento;

public class Test {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole(100, 100);
        History history = new History();
        Archive save = gameRole.save();
        //存档
        history.add(save);
        gameRole.change(100, 90);
        history.add(gameRole.save());
        gameRole.change(90, 10);

        Archive archive = history.getArchive(2); //获取第几次的存档
        archive.getNow();
    }
}
