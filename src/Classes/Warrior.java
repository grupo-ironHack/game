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
        super(listNames[(int)(Math.random()* listNames.length)], (int)(Math.random()*10+1) );
    }

    /*public void chooseYourCharacter() {
        super.chooseYourCharacter();
        Scanner warrior1 = new Scanner(System.in);
        System.out.println("Choose a name for the firs warrior:");
        String userName1 = warrior1.nextLine();

        Scanner warrior2 = new Scanner(System.in);
        System.out.println("Choose a name for the second warrior:");
        String userName2 = warrior2.nextLine();

        Scanner warrior3 = new Scanner(System.in);
        System.out.println("Choose a name for the third warrior:");
        String userName3 = warrior3.nextLine();

        ArrayList<String> team = new ArrayList<String>();

        team.add(userName1);
        team.add(userName2);
        team.add(userName3);

    }*/

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
