package Classes;

import Interfaces.Attacker;

import java.util.ArrayList;
import java.util.Scanner;

public class Wizard extends Character implements Attacker {

    int mana = (int)(Math.random()*(50-10+1)+10);
    int intelligence = (int)(Math.random()*(50-1+1)+1);;

    public Wizard(int id, String name, double hp, boolean isAlive, int mana, int intelligence) {
        super(id, name, hp, isAlive);
        this.mana = mana;
        this.intelligence = intelligence;
    }

    public void chooseYourCharacter() {
        super.chooseYourCharacter();
        Scanner wizard1 = new Scanner(System.in);
        System.out.println("Choose a name for the firs wizard:");
        String userName1 = wizard1.nextLine();

        Scanner wizard2 = new Scanner(System.in);
        System.out.println("Choose a name for the second wizard:");
        String userName2 = wizard2.nextLine();

        Scanner wizard3 = new Scanner(System.in);
        System.out.println("Choose a name for the third wizard:");
        String userName3 = wizard3.nextLine();

        ArrayList<String> team = new ArrayList<String>();

        team.add(userName1);
        team.add(userName2);
        team.add(userName3);

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

    public int getIntelligence() {
        return intelligence;
    }
}
