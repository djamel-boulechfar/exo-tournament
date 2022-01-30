package me.guillaume.recruitment.tournament;

public class Swordsman extends Fighter {

    public Swordsman() {
        hitPoints = 100;
        weapon = new Weapon("One hand sword", false, 5);
        buckler = null;
    }

    public Swordsman(String specialization) {

    }

    public Swordsman equip(String item) {
        Swordsman newSwordsman = this;
        if (item.equals("buckler")) {
            newSwordsman.giveBuckler();
        }
        return newSwordsman;
    }

}
