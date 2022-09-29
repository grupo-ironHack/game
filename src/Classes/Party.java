package Classes;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Party {
    private ArrayList<Character> charctersLives1 = new ArrayList<>();
    private ArrayList<Character> charctersLives2 = new ArrayList<>();
    private ArrayList<Character> charctersDead;
    private ArrayList<Character> character;
    private final String[] CHARACTERS_NAMES = {
            "Pol", "Charles", "Marina", "Dario", "Axel", "Diana", "Avishai", "Ingrid", "Carles", "Jaume", "Alejandro",
            "Pedro", "Leonardo", "Gandalaf", "Merlin", "Saruman", "Dumbledore", "Harry Potter", "Prospero", "Pikachu",
            "Miro", "Picasso", "Rachmaninoff", "Mozart", "John Lenon", "Paul", "Ringo", "Gary", "Benito Camela",
            "Armando Casas", "Elsa Capunta", "Elba Lazo", "Elba Calao", "Zacarias Flores Del Campo",
            "Marcia Ana", "Alan Brito Delgado", "Elsa Pito", "Susana Oria", "Elsa Pato", "Aquiles Bailo"
    };
    private Warrior warrior;
    private Wizard wizard;

    public Party() {
    }

    //    OJO con el constructor y los getters y setter
    public Party(ArrayList<Character> charctersLives, ArrayList<Character> charctersDead, ArrayList<Character> character) {
        setCharacter(charctersLives);
        this.charctersDead = charctersDead;
        this.character = character;
    }

    public Party(Warrior warrior, Wizard wizard) {
        this.warrior = warrior;
        this.wizard = wizard;
    }

    public ArrayList<Character> getCharctersLives() {
        return charctersLives1;
    }

    public void setCharctersLives(ArrayList<Character> charctersLives) {
        this.charctersLives1 = charctersLives;
    }

    public ArrayList<Character> getCharctersDead() {
        return charctersDead;
    }

    public void setCharctersDead(ArrayList<Character> charctersDead) {
        this.charctersDead = charctersDead;
    }

    public ArrayList<Character> getCharacter() {
        return character;
    }

    public void setCharacter(ArrayList<Character> character) {
        this.character = character;
    }

    public Warrior getWarriorRandom() {
        return warrior;
    }

    public void setWarriorRandom(Warrior warriorRandom) {
        this.warrior = warriorRandom;
    }

    public Wizard getWizardRandom() {
        return wizard;
    }

    //public void setWizardRandom(Wizard wizard) {
    //  this.wizard = wizard;}


    /*  ------ METODOS EXTRA -----*/
    public void killCharacter() {
//        Crear u metodo kill para cada equipo o crear un if  oara ekimnar un equipo u otro.
        charctersDead.add(charctersLives1.remove(0));
    }

    public List<Character> superRandom() {
        List<Character> team1Random = new ArrayList<>();

        //wizardRandom = new Wizard();

        team1Random.add(wizard);
        team1Random.add(warrior);
        Wizard wizardR1;

        int i = 0;
        i = (int) (Math.random() * team1Random.size());
        team1Random.get(i);
        Wizard wizardRandom = new Wizard();

        if (team1Random == wizardRandom) {
            wizardRandom.randomWizard();
        }
        if (team1Random == warrior) {
            warrior.randomWarrior();
        }

        return team1Random;

    }


    public String accions(int action) {
        switch (action) {
            case 1:
                System.out.println("Choose the TEAM 1");
                charctersLives1.addAll(Character.chooseYourCharacterTeam1());
                System.out.println("Choose the TEAM 2");
                charctersLives2.addAll(Character.chooseYourCharacterTeam1());
                System.out.println("End case 1  " + charctersLives1.toString() + "\n");
                System.out.println("End case 1  " + charctersLives2.toString() + "\n");
                battlePers(charctersLives1, charctersLives2);
                // wizard.chooseYourCharacterTeam1();
                // Here should call, maybe a second method with a team2 inside.
                break;
            case 2:
                //superRandom();
                charctersLives1.addAll(createRandomParty());
                charctersLives2.addAll(createRandomParty());
                System.out.println("Random case 1 => " + charctersLives1.toString());
                System.out.println("Random case 2 => " + charctersLives2.toString());
                //battlePers(charctersLives1, charctersLives2);
                break;
            case 3:
                creatingTeamCSV("TeamExportWarriors.csv");
                //charctersLives1.addAll(creatingTeamFromCsv("TeamExportWarriors.csv"));
                //System.out.println("Random case 1 => " + charctersLives1.toString());
                System.out.println("Exit from case 3 fill from CSV");
                break;
            default:
                System.out.println("This action is not allowed, please choose a correct one");
                break;
        }
        return "hola";
    }


    public List<Character> createRandomParty() {
        List<Character> randomTeam = new ArrayList<>();
        Wizard wizard;
        Warrior warrior;
        int hp;
        int mana;
        int intelligence;
        int stamina;
        int strength;
        for (int i = 0; i < 3; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(1, 3);
            int numToRandomName = ThreadLocalRandom.current().nextInt(1, CHARACTERS_NAMES.length);
            //Wizards
            if (randomNum == 1) {
                hp = ThreadLocalRandom.current().nextInt(50, 100 + 1);
                mana = ThreadLocalRandom.current().nextInt(10, 50 + 1);
                intelligence = ThreadLocalRandom.current().nextInt(1, 50 + 1);
                wizard = new Wizard(CHARACTERS_NAMES[numToRandomName], hp, mana, intelligence);
                randomTeam.add(wizard);
            }
            //Warriors
            if (randomNum == 2) {
                hp = ThreadLocalRandom.current().nextInt(100, 200 + 1);
                stamina = ThreadLocalRandom.current().nextInt(10, 50 + 1);
                strength = ThreadLocalRandom.current().nextInt(1, 10 + 1);
                warrior = new Warrior(CHARACTERS_NAMES[numToRandomName], hp, stamina, strength);
                randomTeam.add(warrior);
            }

        }
        List<String> randomTeamCheck = new ArrayList<>();
        for (Character value : randomTeam) {
            String nameExist = value.getName();
            if (!randomTeamCheck.contains(nameExist)) {
                randomTeamCheck.add(nameExist);
            } else {
                value.setName(nameExist.concat(" Jr"));
            }
        }
        return randomTeam;
    }

    public int battlePers(ArrayList<Character> team1, ArrayList<Character> team2) {
        warrior = new Warrior();
        wizard = new Wizard();
        for (int i = 0; i < team1.size(); i++) {
            if (team1.get(i) == warrior) {
                System.out.println(team1.get(i).getName());
                return warrior.typeAttack();
            } else {
                System.out.println(team1.get(i + 1).getName());
                return wizard.typeAttack();
            }
        }
        return wizard.typeAttack();
        // if(team2.get(0) == warrior) {
        //   warrior.typeAttack();
        //}else{
        //  wizard.typeAttack();
    }

    /*---------------------------------FILE CSV EXPORT METHOD--------------------------------------------*/
    public static void creatingTeamCSV(String fileName) {
        ArrayList<Character> teamNewCsv = new ArrayList<>();
        BufferedReader reader = null;
        String line = "";
        try {
            reader = new BufferedReader(new FileReader(fileName));
            while ((line = reader.readLine()) != null) {
                String[] attributes = line.split(",");
                for (String index : attributes) {
                    System.out.printf(index);
                    //teamNewCsv.add(createParty(attributes));
                    //Character team = createParty(attributes);
                }
                //System.out.println("-----");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static Character createParty(String[] metadata) {
        //ID OJO
        Wizard wizard = new Wizard();
        String name = metadata[0];
        String hp = (metadata[0]);
        int mana = Integer.parseInt(metadata[0]);
        int intelligence = Integer.parseInt(metadata[1]);
        // create and return book of this metadata
        return new Wizard(mana, intelligence);
    }


}




