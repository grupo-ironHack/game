package Classes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Party {
    private ArrayList<Character> charctersLives1 = new ArrayList<>();
    private ArrayList<Character> charctersLives2 = new ArrayList<>();
    private ArrayList<Character> charctersDead;
    private ArrayList<Character> character;

    private Warrior warriorRandom;
    private Wizard wizardRandom;
    public Party() {}
//    OJO con el constructor y los getters y setter
    public Party(ArrayList<Character> charctersLives, ArrayList<Character> charctersDead, ArrayList<Character> character) {
        setCharacter(charctersLives);
        this.charctersDead = charctersDead;
        this.character = character;
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

    /*  ------ METODOS EXTRA -----*/
    public void killCharacter(){
//        Crear u metodo kill para cada equipo o crear un if  oara ekimnar un equipo u otro.
        charctersDead.add(charctersLives1.remove(0));
    }

    public List<Character> superRandom(){
        List<Character> team1Random = new ArrayList<>();

            team1Random.add(wizardRandom);
            team1Random.add(warriorRandom);
            Wizard  wizardR1;
            int i = 0;
            i = (int)(Math.random()*team1Random.size());
              team1Random.get(i);

              Wizard wizardRandom = new Wizard();

              if (team1Random == wizardRandom){

                  wizardRandom.randomWizard();


              } if (team1Random == warriorRandom){
                  warriorRandom.randomWarrior();
            }

        return team1Random;



    }



    public String accions(int action){
        switch (action){
            case 1:
                charctersLives1.addAll(Character.chooseYourCharacterTeam1());
                charctersLives2.addAll(Character.chooseYourCharacterTeam1());
                System.out.println("End case 1  "+charctersLives1.toString() + "\n");
                System.out.println("End case 1  "+charctersLives2.toString() + "\n");
//                wizard.chooseYourCharacterTeam1();
                // Here should call, maybe a second method with a team2 inside.
                break;
            case 2:

                superRandom();


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

}

