package Classes;

import Interfaces.Attacker;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Character {

    int id;
    String name;
    double hp;
    boolean isAlive;



    public Character(int id, String name, double hp, boolean isAlive) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.isAlive = isAlive;
    }

    public void chooseYourCharacter(){


        System.out.println("The team are compose of 3 characters");
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

    //GETTERS & SETTERS:
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    //METODOS:

    abstract void position();
    abstract void health();
}
