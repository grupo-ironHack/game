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
    String[] myDataArray = new String[]{"[1] CREATE & PERSONALIZE TEAMS", "[2] START BATTLE", "[0] EXIT" };
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
    /*public String accions(int action){

        switch (action){
            case 1:
                Character.chooseYourCharacterTeam1();
//                wizard.chooseYourCharacterTeam1();
                // Here should call, maybe a second method with a team2 inside.
                break;

            case 2:
                wizard.isAlive();
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

    */
  /*  @Override
    void position() {
        
    }
    @Override
    void health() {

    }*/
}
