package com.lab;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks\n");

        //creating the objects
        Wizard Allen = new Wizard("Allen", 15,150,200);
        Warlock Cyber = new Warlock("Cyber", 10, 100, 150);

        //the implementation of method nameDisplay();
        Allen.nameDisplay();
        Cyber.nameDisplay();

        //start the sequence
        Allen.hailStorm(Cyber);
        Allen.showStats();
        Cyber.showStats();


        Cyber.maelStorm(Allen);
        //implementation of method showStats();
        Allen.showStats();
        Cyber.showStats();

        //the use of regen spell
        Allen.healSpell();
        Allen.showStats();
        Cyber.showStats();

        Cyber.fireBall(Allen);
        Allen.showStats();
        Cyber.showStats();

        Allen.kulam(Cyber);
        //the levelUp();method
        Allen.levelUp();
    }
}