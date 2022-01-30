package me.guillaume.recruitment.tournament;

public class Viking extends Fighter {

    public Viking() {
        hitPoints = 120;
        weapon = new Weapon("Axe", false, 6);
        buckler = null;
    }

    public Viking(String specialization) {

    }

    public Viking equip(String item) {
        Viking newViking = this;
        if (item.equals("buckler")) {
            newViking.giveBuckler();
        }
        return newViking;
    }

}
