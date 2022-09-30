package Classes;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Party {
    private List<Character> charctersLives1 = new ArrayList<>();
    private List<Character> charctersLives2 = new ArrayList<>();
    private List<Character> charctersDead = new ArrayList<>();
    private List<Character> character;
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
    public Party(List<Character> charctersLives, List<Character> charctersDead, List<Character> character) {
        setCharacter(charctersLives);
        this.charctersDead = charctersDead;
        this.character = character;
    }

    public Party(Warrior warrior, Wizard wizard) {
        this.warrior = warrior;
        this.wizard = wizard;
    }

    public List<Character> getCharctersLives() {
        return charctersLives1;
    }

    public void setCharctersLives(List<Character> charctersLives) {
        this.charctersLives1 = charctersLives;
    }

    public List<Character> getCharctersDead() {
        return charctersDead;
    }

    public void setCharctersDead(List<Character> charctersDead) {
        this.charctersDead = charctersDead;
    }

    public List<Character> getCharacter() {
        return character;
    }

    public void setCharacter(List<Character> character) {
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
//                wizard.chooseYourCharacterTeam1();
                // Here should call, maybe a second method with a team2 inside.
                break;
            case 2:
                //superRandom();
                charctersLives1.addAll(createRandomParty());
                charctersLives2.addAll(createRandomParty());
                System.out.println("Random case 1 => " + charctersLives1.toString());
                System.out.println("Random case 2 => " + charctersLives2.toString());
                battlePers(charctersLives1, charctersLives2);
                break;
            case 3:
                System.out.println("Exit");
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

        return randomTeam;
    }

    public int battlePers(List<Character> team1, List<Character> team2) {
        warrior = new Warrior();
        wizard = new Wizard();
        for (int i = 0; i < team1.size(); i++) {
            if (team1.get(i) == warrior) {
                System.out.println(team1.get(i).getName());
                System.out.println(team2.get(i).getHp() - warrior.typeAttack());
                return warrior.typeAttack();
            } else {
            //    System.out.println(team2.get(i).getHp() - wizard.typeAttack());
                return wizard.typeAttack();
            }
        }
        return wizard.typeAttack();

         /*  for (int i = 0; i < team1.size(); i++) {
               if(team1.get(i) == warrior)
                   warrior.typeAttack();
               else
                   wizard.typeAttack();
               for (int j = 1; j < team2.size(); j++) {
                   if (team2.get(i) == warrior)
                       warrior.typeAttack();
                   else
                       wizard.typeAttack();
                   }
               }
*/           }
      // }

       //List<Character> teams = new ArrayList<>();

        /*    if(team1.get(0)== warrior && team2.get(0) == warrior)
               return warrior.typeAttack() & warrior.typeAttack();
            if(team1.get(0) == warrior && team2.get(0) == wizard)
                return warrior.typeAttack() & wizard.typeAttack();
            if(team1.get(0) == wizard && team2.get(0) == warrior)
                return wizard.typeAttack() & warrior.typeAttack();
            if(team1.get(0)==wizard && team2.get(0) == wizard)
                return wizard.typeAttack() & wizard.typeAttack();

            return ;
            }
*/
       /*for (int i = 0; i < team1.size(); i++) {
           if (team1.get(i) == warrior) {
               warrior.typeAttack();
           } else {
               //System.out.println(team1.get(i+1).getName());
               wizard.typeAttack();
           }
           for (int j = 0; j < team2.size(); j++) {
               if (team2.get(j) == wizard) {
                   wizard.typeAttack();
               } else {
                   warrior.typeAttack();
               }
           }
           System.out.println("Start battle");
       }return 0;
*/
       // if(team2.get(0) == warrior) {
       //   warrior.typeAttack();
       //}else{
       //  wizard.typeAttack();
   }




