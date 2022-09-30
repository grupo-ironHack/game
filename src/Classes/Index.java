package Classes;

import java.util.Scanner;


public class Index {

    private Warrior warrrior;
    private Wizard wizard;

    private Character character;
    Scanner startIndex = new Scanner(System.in);


    //ARRAY LIST:
//    ArrayList<String> myArrayList = new ArrayList<String>();
    public int numElements = 3;
    String[] myDataArray = new String[]{"[1] CREATE & PERSONALIZE TEAMS", "[2] CREATE RANDOM TEAMS", "[0] EXIT" };
    static String gameName = "RPG GAME";

    //VARIABLES PARA HACER FUNCIONAR INDICE (PRUEBAS)
    int option;
    public int hp = 100;

    String result ="";

    boolean introSelector = false;

    //CONSTRUCTOR CARGAR EL MENU DE ACCIONES EN UN ARRAY:
    public boolean intro(){
        System.out.println("[1] Start Game\n[0] Exit");
        System.out.println("Select an option");

        if(startIndex.nextInt() == 1) {
            introSelector = true;
        } else {
            System.out.println("Good Bye");
            introSelector = false;
        }

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

}
