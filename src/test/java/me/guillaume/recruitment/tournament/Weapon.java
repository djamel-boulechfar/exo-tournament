package me.guillaume.recruitment.tournament;

public class Weapon {

    private String type;
    private boolean twoHanded;
    private int damage;
    private int maxAttacksInARow;
    private int currentAttacksInARow;

    public Weapon(String type, boolean twoHanded, int damage, int maxAttacksInARow) {
        this.type = type;
        this.twoHanded = twoHanded;
        this.damage = damage;
        this.maxAttacksInARow = maxAttacksInARow;
        this.currentAttacksInARow = 0;
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

    public boolean canAttack() {
        if (maxAttacksInARow != -1) {
            if (currentAttacksInARow == maxAttacksInARow) {
                currentAttacksInARow = 0;
                return false;
            }
            currentAttacksInARow++;
        }
        return true;
    }

}
