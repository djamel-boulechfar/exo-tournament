package me.guillaume.recruitment.tournament;

public abstract class Fighter {

    private int hitPoints;
    private Weapon weapon;

    public void engage(Fighter enemy) {

    }

    public abstract Fighter equip(String item);

    public int hitPoints() {
        return this.hitPoints;
    }
}
