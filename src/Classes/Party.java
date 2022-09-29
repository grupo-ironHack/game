package Classes;
import java.util.ArrayList;

public class Party {
    private ArrayList<Character> charctersLives1 = new ArrayList<>();
    private ArrayList<Character> charctersLives2 = new ArrayList<>();
    private ArrayList<Character> charctersDead;
    private ArrayList<Character> character;

    private Warrior warrior1 ;

    private static String[] listNames = {"ingrid", "pol", "Diana", "Mario bros"};

    public Party() {}
//    OJO con el constructor y los getters y setter
    public Party(ArrayList<Character> charctersLives, ArrayList<Character> charctersDead, ArrayList<Character> character, Warrior warrior1) {
        setCharacter(charctersLives);
        this.charctersDead = charctersDead;
        this.character = character;
        this.warrior1 = warrior1;
    }

    public Warrior getWarrior1() {

        return warrior1;
    }

    public void setWarrior1(Warrior warrior1) {
        this.warrior1 = warrior1;
    }

    public String[] getListNames() {
        return listNames;
    }

    public void setListNames(String[] listNames) {
        this.listNames = listNames;
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
                //isAlive();
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
// MÉTODO RANDOM NAME
    public static String randomName(){
        int i =0;
        i = (int) (Math.random()*(5));
        return listNames[i];
    }
// VOLVER A REPASAR EL MÉTODO
    public static void addName(){
        String names = randomName();
        boolean foundIt = false;
        for(int i = 0; i < listNames.length; i++){
            if (names.equals(listNames[i]))
            foundIt = true;
        }

        if(foundIt == true)
            names = "jr " + names;

        System.out.println(names);
    }

}
