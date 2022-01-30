package me.guillaume.recruitment.tournament;

public class Weapon {

    private String type;
    private int damage;

    public Weapon(String type, int damage) {
        this.type = type;
        this.damage = damage;
    }

    public int getDamage() {
        return this.damage;
    }

    public String getType() {
        return this.type;
    }

}
