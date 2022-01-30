package me.guillaume.recruitment.tournament;

public abstract class Fighter {

    int hitPoints;
    Weapon weapon;

    public void engage(Fighter enemy) {
        int turn = 0;
        while (this.hitPoints() > 0) {
            if (turn == 0) {
                this.attack(enemy);
                turn = 1;
            } else if (turn == 1) {
                enemy.attack(this);
                turn = 0;
            }
        }
    }

    public abstract Fighter equip(String item);

    public int hitPoints() {
        return this.hitPoints;
    }

    public Weapon weapon() {
        return this.weapon;
    }

    public void takeDamage(int damage) {
        this.hitPoints -= damage;
        if (this.hitPoints < 0) {
            this.hitPoints = 0;
        }
    }

    public void attack(Fighter enemy) {
        int damage = this.weapon().getDamage();
        enemy.takeDamage(damage);
    }
}
