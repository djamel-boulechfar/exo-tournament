package me.guillaume.recruitment.tournament;

public class Highlander extends Fighter {

    public Highlander() {
        hitPoints = 150;
        weapon = new Weapon("Great Sword", true, 12, 2);
        buckler = null;
        armored = false;
    }

    public Highlander(String specialization) {

    }

    public Highlander equip(String item) {
        Highlander newHighlander = this;
        if (item.equals("buckler")) {
            newHighlander.giveBuckler();
        }
        if (item.equals("armor")) {
            newHighlander.giveArmor();
        }
        return newHighlander;
    }

}
