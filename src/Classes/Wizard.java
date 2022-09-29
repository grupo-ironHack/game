package Classes;

import Interfaces.Attacker;

import java.util.ArrayList;
import java.util.Scanner;

public class Wizard extends Character implements Attacker {
    int mana;
    int intelligence;
    static String[] listNames = {"ingrid", "pol", "Diana", "Mario bros"};

    public Wizard( String name, double hp, int mana, int intelligence) {
        super( name, hp);
        setMana(mana);
        setIntelligence(intelligence);
    }

    public Wizard() {
        super(listNames[(int)(Math.random()* listNames.length)], (int)(Math.random()*10+1) );
    }

    public void randomWizard(){
        setName(listNames[(int)(Math.random()* listNames.length)]);
        setHp((int)(Math.random()*(100-50+1)+50));
        setMana((int)(Math.random()*(50-10+1)+10));
        setIntelligence((int)(Math.random()*(50-1+1)+1));

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

    //GETTERS & SETTERS:

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
