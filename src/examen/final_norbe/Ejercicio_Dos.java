package examen.final_norbe;

import java.util.Scanner;

/**
 *
 * @author Norbenys
 */
public class Ejercicio_Dos {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String in;
        System.out.println("Por favor, ingrese el texto:");
        in = sc.nextLine();
        ListaEjercicio_Dos info = new ListaEjercicio_Dos();
        System.out.println("");
        System.out.println("Separación:");
        String datos[] = in.split(" ");

        RecursividadEjercicio_Dos.Cargarlista(0, datos, info);

        System.out.println(info.imprimir());
    }

}
