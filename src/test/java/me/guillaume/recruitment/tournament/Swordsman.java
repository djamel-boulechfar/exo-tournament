package me.guillaume.recruitment.tournament;

public class Swordsman extends Fighter {

    public Swordsman() {
        hitPoints = 100;
        weapon = new Weapon("One hand sword", 5);
    }

    public Swordsman(String specialization) {

    }

    public Swordsman equip(String item) {
        return null;
    }

}
