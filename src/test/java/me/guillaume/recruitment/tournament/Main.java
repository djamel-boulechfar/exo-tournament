package me.guillaume.recruitment.tournament;

public class Main {

    public static void main(String[] args) {
        Swordsman swordsman = new Swordsman()
                .equip("buckler");

        Viking viking = new Viking()
                .equip("buckler");

        swordsman.engage(viking);
    }

}
