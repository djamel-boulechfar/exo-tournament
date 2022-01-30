package me.guillaume.recruitment.tournament;

public class Buckler {

    private int axeBlocksLeft;
    private boolean blocksNextAttack;

    public Buckler() {
        this.axeBlocksLeft = 3;
        this.blocksNextAttack = true;
    }

    public int axeBlocksLeft() {
        return this.axeBlocksLeft;
    }

    public boolean canBlockAttack(boolean attackedByAxe) {
        if (blocksNextAttack) { // If the buckler didn't block last attack
            if (attackedByAxe) {
                this.axeBlocksLeft -= 1; // Decrease axeBlocksLeft
            }
            this.blocksNextAttack = false; // Put this boolean to false to tell that it shouldn't block next attack
            return true; // Return true to tell that the attack has been blocked
        } else { // If the buckler blocked last attack
            blocksNextAttack = true; // Put this boolean to true to tell that it should block next attack
        }
        return false; // Return false to tell that the attack hasn't been blocked
    }

}
