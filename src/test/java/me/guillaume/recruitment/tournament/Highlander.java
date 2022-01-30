package me.guillaume.recruitment.tournament;

public class Highlander extends Fighter {

    public Highlander() {
        hitPoints = 150;
        weapon = new Weapon("Great Sword", true, 12, 2);
        buckler = null;
        armored = false;
        specialization = "";
    }

    public Highlander(String fighterSpecialization) {
        hitPoints = 150;
        weapon = new Weapon("Great Sword", true, 12, 2);
        buckler = null;
        armored = false;
        specialization = fighterSpecialization;
    }

    @Override
    public Highlander equip(String item) {
        Highlander newHighlander = this;
        if (item.equals("buckler")) {
            newHighlander.giveBuckler();
        }
        if (item.equals("armor")) {
            newHighlander.giveArmor();
        }
        if (item.equals("axe")) {
            newHighlander.setWeapon(new Weapon("Axe", false, 6, -1));
        }
        return newHighlander;
    }

    @Override
    public int applyModifiers(int baseDamage) {
        int finalDamage = baseDamage;
        if (specialization.equals("Veteran")) {
            if (hitPoints < 45) {
                finalDamage *= 2;
            }
        }
        return finalDamage;
    }

}
