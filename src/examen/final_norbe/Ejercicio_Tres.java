package examen.final_norbe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Norbenys
 */
public class Ejercicio_Tres {
    
     //Colores
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";

    static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {

        String Opcion;

        do {
            System.out.println("");
            System.out.println("");
            System.out.println(ANSI_CYAN +"\t**************");
            System.out.println(ANSI_CYAN +"\t*   SAIME    *");
            System.out.println("\t**************"+ANSI_RESET);
            System.out.println("");
            System.out.println("[1] Cedulación.");
            System.out.println("[2] Cita de pasaporte.");
            System.out.println("[3] Retiro de documentos.");
            System.out.println("[4] Salir.");
            System.out.println("");
            System.out.print("¿Qué desea realizar?");
            Opcion = Entrada.nextLine();
            switch (Opcion) {
                case "1":
                    Cedulación();
                    break;
                case "2":
                    CitaPasaporte();
                    break;
                case "3":
                    RetiroDocumentos();
                    break;
                case "4":
                    Salir();
                    break;

                default:
                    System.out.println("");
                    System.out.println("\t\t*****************");
                    System.out.println("\t\t*Opción Inválida*");
                    System.out.println("\t\t*****************");
            }
        } while (!Opcion.equals("4"));
    }

    class Clientes {

        FileReader fr;

        void leer(ColaEjercicio_Tres cola) throws IOException {
            fr = new FileReader("Clientes.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(" ");
                String nombre = datos[0];
                int opcionCedulación = Integer.parseInt(datos[1]);
                int opcionCitaPasaporte = Integer.parseInt(datos[2]);
                int opcionRetiroDocumentos = Integer.parseInt(datos[3]);
                cola.encolar(nombre, opcionCedulación, opcionCitaPasaporte, opcionRetiroDocumentos);
            }
        }
    }

}
