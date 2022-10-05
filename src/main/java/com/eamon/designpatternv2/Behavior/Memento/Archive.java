package com.eamon.designpatternv2.Behavior.Memento;

/**
 * 备忘录
 */
public class Archive implements Memento {

    private int life;
    private int magic;

    public Archive(int life, int magic) {
        this.life = life;
        this.magic = magic;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    @Override
    public void getNow() {
        System.out.println("当前生命值：" + life + "魔法值：" + magic);
    }
}
