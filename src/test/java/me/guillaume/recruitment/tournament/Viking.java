package me.guillaume.recruitment.tournament;

public class Viking extends Fighter {

    public Viking() {
        hitPoints = 120;
        weapon = new Weapon("One hand axe", 6);
    }

    public Viking(String specialization) {

    }

    public Viking equip(String item) {
        return null;
    }

}
