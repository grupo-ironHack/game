package Classes;



import java.util.ArrayList;
import java.util.Scanner;


public class Index extends Character {
    Scanner startIndex = new Scanner(System.in);

    //ARRAY LIST:
    ArrayList<String> myArrayList = new ArrayList<String>();

    public int numElements = 3;
    String[] myDataArray = new String[numElements];

    static String gameName = "RPG GAME";

    public Index(int id, String name, double hp, boolean isAlive) {
        super(id, name, hp, isAlive);
    }

    //CONSTRUCTOR CARGAR EL MENU DE ACCIONES EN UN ARRAY:

    public void index() {
        myDataArray[0] = "[1] CHOOSE YOUR CHARACTERS";
        myDataArray[1] = "[2] START BATTLE";
        myDataArray[3] = "[0] EXIT";
    }

    //EJECUTAR LAS ACCIONES:
    public String accions(int action){
        Object result;
        switch (action){
            case 1:
                chooseYourCharacter();
                break;

            case 2:
                isAlive();
                break;

            case 3:
                System.out.println("Exit");
                break;

            default:
                System.out.println("This action is not allowed, please choose a correct one");
                break;
        }
        return null;
    }

    @Override
    void position() {
        
    }

    @Override
    void health() {

    }
}
