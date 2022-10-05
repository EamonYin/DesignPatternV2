package com.eamon.designpatternv2.Behavior.Memento;

public class GameRole {
    private int life;
    private int magic;

    public GameRole(int life, int magic) {
        this.life = life;
        this.magic = magic;
    }

    public Archive save() {
        return new Archive(life, magic);
    }

    public void change(Integer life, Integer magic) {
        this.life = life;
        this.magic = magic;
    }

    public void resume(Archive archive) {
        this.life = archive.getLife();
        this.magic = archive.getMagic();
    }
}
