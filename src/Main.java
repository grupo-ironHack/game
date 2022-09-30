import Classes.Index;
import Classes.Party;
import Classes.Warrior;
import Classes.Character;


public class Main {
    public static void main(String[] args) {
        Party num1 = new Party();
        Party num2 = new Party();
        //System.out.println(num1.battlePers(num1.createRandomParty(),num2.superRandom()));


        Warrior wiz = new Warrior("Obi",10, 3, 80);

        System.out.println(wiz.typeAttack());




        Index Steps = new Index();
        Party partyStep = new Party();

        //STEP 1: INICIAR JUEGO:
        boolean step1 = Steps.intro();
        int step2;
        boolean repeat = true;

        if (step1) {
            //STEP 2: ACCION A REALIZAR
            step2 = Steps.options();
            String resultActions = partyStep.accions(step2);

            //MIENTRAS SU VALOR SEA VERDADERO:
            while (repeat) {

                if (Steps.hp > 0) {
//                    String resultActions = Steps.accions(step2);
                    repeat = false;

                    //SI EXISTE LA ACCION AÑADIMOS LA ACCION SELECCIONADA:
                    if (step2 > 0 && step2 < (Steps.numElements)) {
                        resultActions = "ACTION [" + step2 + "]:\n\t" + resultActions;
                    }

                    //MOSTRAMOS RESULTADO DE LA ACCION SELECCIONADA:
                    System.out.println(resultActions);

                } else {
                    repeat = false;
                }

            }
        }


    }


}
