package Classes;



import java.util.ArrayList;
import java.util.Scanner;


public class Index extends Character  {
    Scanner startIndex = new Scanner(System.in);

    //ARRAY LIST:
    ArrayList<String> myArrayList = new ArrayList<String>();

    public int numElements = 3;
    String[] myDataArray = new String[numElements];

    static String gameName = "RPG GAME";

    //VARIABLES PARA HACER FUNCIONAR INDICE (PRUEBAS)
    int option;
    public int hp = 100;

    String result ="";

    boolean introSelector = false;

    public Index(int id, String name, double hp, boolean isAlive) {

        super(id, name, hp, isAlive);
    }

    //CONSTRUCTOR CARGAR EL MENU DE ACCIONES EN UN ARRAY:

    public void Index() {
        myDataArray[0] = "[1] CHOOSE YOUR CHARACTERS";
        myDataArray[1] = "[2] START BATTLE";
        myDataArray[2] = "[0] EXIT";

    }

    public boolean intro(){
        System.out.println("[1] Start Game\n[0] Exit");
        System.out.println("Select an option");

        if(startIndex.nextInt() == 1) introSelector = true;

        return introSelector;
    }

    //MUESTRA LAS DIFERENTES OPCIONES PARA LAS ACCIONES:
    public int options(){
        System.out.println(gameName);

        String strOptions = "";
        for(int i=0; i<myDataArray.length; i++){
            strOptions += myDataArray[i]+"\n";
        }
        //System.out.println(strLine);
        System.out.println(" - POSIBLE ACTIONS -");
        System.out.println(strOptions);
        System.out.println("Select Action:\n");


        option = startIndex.nextInt();

        return option;
    }

    //EJECUTAR LAS ACCIONES:
    public String accions(int action){

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
        return result;
    }

    @Override
    void position() {
        
    }

    @Override
    void health() {

    }
}
