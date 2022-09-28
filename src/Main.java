import Classes.Index;

public class Main {
    public static void main(String[] args) {

        Index Steps = new Index(1, "Pol", 10, true);

        //STEP 1: INICIAR JUEGO:
        boolean step1 = Steps.intro();
        int step2;
        boolean repeat = true;

        if (step1) {

            //STEP 2: ACCION A REALIZAR
            step2 = Steps.options();

            //MIENTRAS SU VALOR SEA VERDADERO:
            while (repeat) {

                if (Steps.hp > 0) {
                    String resultActions = Steps.accions(step2);


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
