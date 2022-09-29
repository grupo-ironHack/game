package Classes;

import Interfaces.Attacker;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class Warrior extends Character implements Attacker {

    int stamina = (int)(Math.random()*(50-10+1)+10);
    int strength = (int)(Math.random()*10+1);

    static String[] listNames = {"ingrid", "pol", "Diana", "Mario bros"};

   //CONSTRUCTORS:

    public Warrior(String name, double hp, int stamina, int strength) {
        super(name, hp);
        this.stamina = stamina;
        this.strength = strength;
    }
    //Especificar el random del hp
    public Warrior() {
        super(listNames[(int)(Math.random()* listNames.length)], (int)(Math.random()*(200-100+1)+100));
    }

    public void hardAttack() {
        int hardAttack = strength;
        stamina = stamina - 5;

    }

    public void softAttack(){
        BigDecimal softAttack = (BigDecimal.valueOf(strength / 2).setScale(2, RoundingMode.DOWN));
                strength = strength + 1;
    }



    public void typeAttack() {
        if(stamina > 5){
            hardAttack();
        } else  {
            softAttack();
        }

    }

    public void returnTeam() {

    }


    public void goingCementery() {

    }

    void position() {

    }

    void health() {

    }

    //GETTERS & SETTERS:

    public int getStamina() {
        return stamina;
    }

    public int getStrenght() {
        return strength;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "stamina=" + stamina +
                ", strength=" + strength +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", isAlive=" + isAlive +
                '}';
    }
}
