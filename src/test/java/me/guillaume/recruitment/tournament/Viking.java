package me.guillaume.recruitment.tournament;

public class Viking extends Fighter {

    public Viking() {
        hitPoints = 120;
        weapon = new Weapon("Axe", false, 6, -1);
        buckler = null;
        armored = false;
        specialization = "";
    }

    public Viking(String fighterSpecialization) {
        hitPoints = 120;
        weapon = new Weapon("Axe", false, 6, -1);
        buckler = null;
        armored = false;
        specialization = fighterSpecialization;
    }

    @Override
    public Viking equip(String item) {
        Viking newViking = this;
        if (item.equals("buckler")) {
            newViking.giveBuckler();
        }
        if (item.equals("armor")) {
            newViking.giveArmor();
        }
        if (item.equals("axe")) {
            newViking.setWeapon(new Weapon("Axe", false, 6, -1));
        }
        return newViking;
    }

    @Override
    public int applyModifiers(int baseDamage) {
        return baseDamage;
    }


}
