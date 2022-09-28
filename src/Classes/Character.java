package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Character {
    static int counter = 0;
    int id;
    String name;
    double hp;
    boolean isAlive = true;

    private ArrayList<Character> characters;

    public Character(String name, double hp) {
        this.id = counter++;
        this.name = name;
        this.hp = hp;
    }


    public Character() {
        this.characters = new ArrayList<Character>();
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

    // REVISAR ESTE SETTER
    public void setCharacters(Character characters) {
        this.characters.add(characters);
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    //METODOS:
    public static ArrayList<Character> chooseYourCharacterTeam1() {
        Scanner sc = new Scanner(System.in);
        Wizard wizard;
        Warrior warrior;
        ArrayList<Character> team1 = new ArrayList<>();
        /*----------------------------------------------------------------*/
        System.out.println("The team are compose by 3 characters");
        int counter = 1;
        for (int i = 0; i < 3; i++) {
            System.out.println("Choose the kind of character, press 1 for wizard or 2 for warrior");
            while (!sc.hasNextInt()) { //This while loop is to check that the input is an int and not a String.
                sc.nextLine();
                System.out.println("Please try again. \nChoose the kind of character, press 1 for wizard or 2 for warrior");
            }
            int characterTeam = sc.nextInt();
            if (characterTeam == 1) {
                System.out.println("Write the name of your " + counter + "º character: ");
                String name1 = sc.next();
                System.out.println("Introduce the mana of your wizard between 10-50 and then introduce");
                int valueMana = sc.nextInt();
                if (10 > valueMana || valueMana > 50) {
                    System.out.println("Error wrong value");
                    System.out.println("Introduce the mana of your wizard should be between 10-50 and then introduce");
                    valueMana = sc.nextInt();
                }
                System.out.println("Now introduce the intelligence of your wizard should be between 1-50");
                int valueIntelligence = sc.nextInt();
                if (valueIntelligence < 1 || valueIntelligence > 50) {
                    System.out.println("Error wrong value");
                    System.out.println("The intelligence of your wizard should be between 1-50");
                    valueIntelligence = sc.nextInt();
                }

                wizard = new Wizard(String.valueOf(name1), 100, valueMana, valueIntelligence);
                team1.add(wizard);
                wizard.toString();
            } else if (characterTeam == 2) {
                System.out.println("write a name of your " + counter + "º character: ");
                String nameCharacter = sc.next();
                System.out.println("Introduce the stamina of your warrior should be between 10-50");
                int valueStamina = sc.nextInt();
                if (10 > valueStamina || valueStamina > 50) {
                    System.out.println("Error wrong value");
                    System.out.println("Introduce the stamina of your warrior should be between 10-50");
                    valueStamina = sc.nextInt();
                }
                System.out.println("Now introduce the strength of your warrior should be between 1-10");
                int valueStrength = sc.nextInt();
                if (valueStrength < 1 || valueStrength > 10) {
                    System.out.println("Error wrong value");
                    System.out.println("The strength of your warrior between 1-10");
                    // verficar porque si hay dos errores consecutivos el tercero lo salta con lenextInt()....
                    valueStrength = sc.nextInt();
                }
                warrior = new Warrior(String.valueOf(nameCharacter), 100, valueStamina, valueStrength);
                team1.add(warrior);
            } else {
                System.out.println("wrong number, Choose the kind of character, press 1 for wizard or 2 for warrior");
            }
            counter++;

        }
        System.out.println(team1.get(0));
        System.out.println(team1.get(1));
        System.out.println(team1.get(2));
        return team1;
    }

    public void setName(String name) {
        String[] teamArr = name.split(" ");
        for (Character i : characters) {
            if (name.equals(i.getName())) {
//                return i;
            }
        }


        this.name = name;
    }

    abstract void position();

    abstract void health();

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", isAlive=" + isAlive +
                '}';
    }
}
