package Classes;

import Interfaces.Attacker;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class Warrior extends Character implements Attacker {

    int stamina;
    int strength;

    static String[] listNames = {"ingrid", "pol", "Diana", "Mario bros"};


   //CONSTRUCTORS:

    public Warrior(String name, double hp, int strength) {
        super(name, hp);
        getStamina();
        this.strength = strength;
    }

    public Warrior(String name, double hp, int stamina, int strength) {
        super(name, hp);
        this.stamina = stamina;
        this.strength = strength;
    }

    //Especificar el random del hp
    public Warrior() {
        super(listNames[(int)(Math.random()* listNames.length)], (int)(Math.random()*10+1));
    }

    public void randomWarrior(){
        setName(listNames[(int)(Math.random()* listNames.length)]);
        setHp((int)(Math.random()*(200-100+1)+100));
        setStamina((int)(Math.random()*(50-10+1)+10));
        setStamina((int)(Math.random()*10+1));
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

    public int hardAttack() {
        int hardAttack = strength;
        restStaminaHard();
        System.out.println("The damage of this attack is: ");
        return hardAttack;
    }

    public int restStaminaHard(){
        int stamina1 = stamina - 5;
        System.out.println("Your current stamina is: " + stamina1);
        return stamina1;
    }

    public int softStrength(){
        int strength1 = strength + 1;
        System.out.println("Your current strength is: " + strength1);
        return strength1;
    }
    public int softAttack() {
        int softAttack1 = strength / 2;
        softStrength();
        System.out.println("The damage of this attack is: ");
        return softAttack1;
    }


    public int typeAttack() {
        if(stamina > 5){
            return hardAttack();
        } else  {
            return softAttack();
        }

    }


    public void goingCementery() {

    }

    void position() {

    }

    void health() {

    }

    //GETTERS & SETTERS:

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

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
