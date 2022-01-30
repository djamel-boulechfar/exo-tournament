package me.guillaume.recruitment.tournament;

public class Viking extends Fighter {

    public Viking() {
        hitPoints = 120;
        weapon = new Weapon("Axe", false, 6, -1);
        buckler = null;
        armored = false;
    }

    public Viking(String specialization) {

    }

    public Viking equip(String item) {
        Viking newViking = this;
        if (item.equals("buckler")) {
            newViking.giveBuckler();
        }
        if (item.equals("armor")) {
            newViking.giveArmor();
        }
        return newViking;
    }

}
