package me.guillaume.recruitment.tournament;

public class Swordsman extends Fighter {

    private int poisonHitsLeft;

    public Swordsman() {
        hitPoints = 100;
        weapon = new Weapon("One hand sword", false, 5, -1);
        buckler = null;
        armored = false;
        specialization = "";
    }

    public Swordsman(String fighterSpecialization) {
        hitPoints = 100;
        weapon = new Weapon("One hand sword", false, 5, -1);
        buckler = null;
        armored = false;
        specialization = fighterSpecialization;
        if (specialization.equals("Vicious")) {
            this.poisonHitsLeft = 2;
        }
    }

    @Override
    public Swordsman equip(String item) {
        Swordsman newSwordsman = this;
        if (item.equals("buckler")) {
            newSwordsman.giveBuckler();
        }
        if (item.equals("armor")) {
            newSwordsman.giveArmor();
        }
        if (item.equals("axe")) {
            newSwordsman.setWeapon(new Weapon("Axe", false, 6, -1));
        }
        return newSwordsman;
    }

    @Override
    public int applyModifiers(int baseDamage) {
        int finalDamage = baseDamage;
        if (specialization.equals("Vicious")) {
            if (poisonHitsLeft > 0) {
                finalDamage += 20;
                this.poisonHitsLeft--;
            }
        }
        return finalDamage;
    }

}
