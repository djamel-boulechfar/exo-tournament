package me.guillaume.recruitment.tournament;

public abstract class Fighter {

    int hitPoints;
    Weapon weapon;
    Buckler buckler;
    boolean armored;

    /* --- Getters & setters --- */
    public int hitPoints() {
        return this.hitPoints;
    }

    public Weapon weapon() {
        return this.weapon;
    }

    public Buckler buckler() {
        return this.buckler;
    }
    /* ------------------------- */

    // Common methods

    // Function that starts a fight between the fighter and an enemy
    public void engage(Fighter enemy) {
        int turn = 0; // int used to determine who attacks
        while (this.hitPoints() > 0 && enemy.hitPoints() > 0) { // While both fighters are alive
            if (turn == 0) { // If turn is equal to 0, the fighter attacks the enemy and turn is set to 1
                this.attack(enemy);
                turn = 1;
            } else if (turn == 1) { // If turn is equal to 1, the enemy attacks the fighter and turn is set to 0
                enemy.attack(this);
                turn = 0;
            }
        }
    }

    // Function that makes the fighter lose a certain amount of hitPoints
    public void takeDamage(int damage) {
        if (this.armored) { // If the fighter has an armor, reduce taken damage by 3
            damage -= 3;
        }
        this.hitPoints -= damage;
        if (this.hitPoints < 0) { // If the fighter hitPoints are below 0, they are set to 0
            this.hitPoints = 0;
        }
    }

    // Function that makes the fighter attack his enemy
    public void attack(Fighter enemy) {
        if (this.weapon().canAttack()) {
            Buckler enemyBuckler = enemy.buckler(); // Getting the enemy's buckler
            boolean attackBlocked = false;
            if (enemyBuckler != null) { // If the enemy has a buckler
                boolean attacksWithAnAxe = this.weapon().getType().equals("Axe"); // Check if fighter attacks with an axe
                attackBlocked = enemyBuckler.canBlockAttack(attacksWithAnAxe); // Try to block the attack and get result
            }
            if(attackBlocked) { // If the attack has been blocked
                if (enemyBuckler.axeBlocksLeft() == 0) { // Check if the enemy's buckler has any axe blocks left
                    enemy.removeBuckler(); // If not, remove it
                }
            } else { // If the attack hasn't been blocked
                int damage = this.weapon().getDamage(); // Get the fighter's weapon damage
                if (this.armored) { // If the fighter has an armor, reduce delivered damage by 1
                    damage -= 1;
                }
                enemy.takeDamage(damage); // Make the enemy take that amount of damage
            }
        }
    }

    // Function that adds a buckler to the fighter
    public void giveBuckler() {
        this.buckler = new Buckler();
    }

    // Function that removes the fighter's buckler
    public void removeBuckler() {
        this.buckler = null;
    }

    // Function that adds armor to the fighter
    public void giveArmor() {
        this.armored = true;
    }

    // Abstract methods

    // Function that equips an item on the fighter and returns the resulting fighter
    public abstract Fighter equip(String item);

}
