package Classes;

import Interfaces.Attacker;

import java.util.ArrayList;
import java.util.Scanner;

public class Wizard extends Character implements Attacker {
    int mana = (int)(Math.random()*(50-10+1)+10);
    int intelligence = (int)(Math.random()*(50-1+1)+1);;

    public Wizard(int id, String name, double hp, boolean isAlive, int mana, int intelligence) {
        super(id, name, hp, isAlive);
        setMana(mana);
        setIntelligence(intelligence);
    }

    public void fireBall(){
        int fireBall = intelligence;
        mana = mana - 5;
    }

    public void hitStick(){
        int stickStrike = 2;
        mana = mana + 1;
    }
    public void typeAttack() {
        if (mana > 5){
            fireBall();
        } else {
            hitStick();
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

    //GETTERS:
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getIntelligence() {
        return intelligence;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "mana=" + mana +
                ", intelligence=" + intelligence +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", isAlive=" + isAlive +
                '}';
    }
}
