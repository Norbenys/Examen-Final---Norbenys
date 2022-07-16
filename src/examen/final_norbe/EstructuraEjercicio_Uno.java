package examen.final_norbe;

/**
 *
 * @author Norbenys
 */
public class EstructuraEjercicio_Uno {

    //Colores
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";

    int númeroDelCliente[] = new int[5];
    String Cliente[] = new String[5];

    public void Datos() {
        
        Cliente[4] = "Silvestre Cárdenas";
        númeroDelCliente[0] = 8;

        Cliente[3] = "Andrés López";
        númeroDelCliente[1] = 1;

        Cliente[2] = "Andreina González";
        númeroDelCliente[2] = 5;

        Cliente[1] = "María Pérez";
        númeroDelCliente[3] = 0;

        Cliente[0] = "Armando Paredes";
        númeroDelCliente[4] = 10;

    }

    public void Criterios() {
        
        System.out.println(ANSI_CYAN + "Lista de resultados de satisfacción de los clientes de MOVISTAR a sus llamadas de atención al cliente:" + ANSI_RESET);
        System.out.println("");
        
        for (int i = 0; i < númeroDelCliente.length; i++) {
            if (númeroDelCliente[i] == 0) {

                System.out.println(Cliente[i] + ", cliente número: " + númeroDelCliente[i] + ", no atendió.");
                System.out.println("");
            } else if (númeroDelCliente[i] >= 1 && númeroDelCliente[i] <= 4) {
                System.out.println(Cliente[i] + ", cliente número: " + númeroDelCliente[i] + ", no satisfecho.");
                System.out.println("");
            } else if (númeroDelCliente[i] == 5) {
                System.out.println(Cliente[i] + ", cliente número: " + númeroDelCliente[i] + ", neutro.");
                System.out.println("");
            } else if (númeroDelCliente[i] >= 6 && númeroDelCliente[i] <= 8) {
                System.out.println(Cliente[i] + ", cliente número: " + númeroDelCliente[i] + ", satisfecho.");
                System.out.println("");
            } else if (númeroDelCliente[i] < 9 || númeroDelCliente[i] > 10) {
            } else {
                System.out.println(Cliente[i] + ", cliente número: " + númeroDelCliente[i] + ", muy satisfecho.");
            }
        }

    }
}
