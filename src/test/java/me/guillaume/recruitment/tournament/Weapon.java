package me.guillaume.recruitment.tournament;

public class Weapon {

    private String type;
    private boolean twoHanded;
    private int damage;

    public Weapon(String type, boolean twoHanded, int damage) {
        this.type = type;
        this.twoHanded = twoHanded;
        this.damage = damage;
    }

    public String getType() {
        return this.type;
    }

    public boolean isTwoHanded() {
        return this.twoHanded;
    }

    public int getDamage() {
        return this.damage;
    }

}
