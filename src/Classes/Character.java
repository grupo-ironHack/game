package Classes;

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

    public ArrayList<Character> chooseYourCharacterTeam1(){

        ArrayList<Character> team1 = new ArrayList<Character>();
        System.out.println("The team are compose by 3 characters");
        /*----------------------------------------------------------------*/
        int counter = 1;
        for (int i = 0; i < 3 ; i++) {
            System.out.println("Choose the kind of wizard = 1 or warrior = 2 ");
            int characterTeam1 = new Scanner(System.in).nextInt();
            if (characterTeam1 == 1){
                System.out.println("write a name for the PERSONAJE "+ counter + ": ");
                String name1 = new Scanner(System.in).nextLine();
                System.out.println("Introduce the mana of your wizard between 10-50 and then introduce");
                int valueMana = new Scanner(System.in).nextInt();
                if (10 > valueMana || valueMana > 50){
                    System.out.println("error wrong value");
                    System.out.println("Introduce the mana of your wizard between 10-50 and then introduce");
                    valueMana = new Scanner(System.in).nextInt();
                }
                System.out.println("Now introduce the intelligence of your wizard between 1-50");
                int valueIntelligence = new Scanner(System.in).nextInt();
                if (valueIntelligence < 1 || valueIntelligence > 50){
                    System.out.println("error wrong value");
                    System.out.println("The intelligence of your wizard between 1-50");
                    valueIntelligence = new Scanner(System.in).nextInt();
                }
                Wizard w = new Wizard(id, String.valueOf(name1), hp, isAlive,  valueMana, valueIntelligence);
                team1.add(w);
                w.toString();
            } else if (characterTeam1 == 2){
                System.out.println("write a name for the PERSONAJE "+ counter + ": ");
                String name1 = new Scanner(System.in).nextLine();
                System.out.println("Introduce the stamina of your warrior between 10-50");
                int valueStamina = new Scanner(System.in).nextInt();
                if (10 > valueStamina || valueStamina > 50){
                    System.out.println("error wrong value");
                    System.out.println("Introduce the stamina of your warrior between 10-50");
                    valueStamina = new Scanner(System.in).nextInt();
                }
                System.out.println("Now introduce the strength of your warrior between 1-10");
                int valueStrength = new Scanner(System.in).nextInt();
                if (valueStrength < 1 || valueStrength > 10){
                    System.out.println("error wrong value");
                    System.out.println("The strength of your warrior between 1-10");
                    // verficar porque si hay dos errores consecutivos el tercero lo salta con lenextInt()....
                    valueStrength = new Scanner(System.in).nextInt();
                }
                Warrior w = new Warrior(id, String.valueOf(name1), hp, isAlive,  valueStamina, valueStrength);
                team1.add(w);
                w.toString();
            } else {
                System.out.println("wrong number, choose just 1 or 2");
            }
            counter++;
        }
        return team1;
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
