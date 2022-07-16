package examen.final_norbe;

/**
 *
 * @author Norbenys
 */
public class ColaEjercicio_Tres {

    NodoEjercicio_Tres primero, ultimo;

    boolean colaVacia() {
        return primero == null;
    }

    void encolar(String nombre, int opcionCedulación, int opcionCitaPasaporte, int opcionRetiroDocumentos) {
        NodoEjercicio_Tres nuevo = new NodoEjercicio_Tres(nombre, opcionCedulación, opcionCitaPasaporte, opcionRetiroDocumentos);
        if (colaVacia()) {
            primero = nuevo;
            ultimo = primero;
        } else {
            ultimo.sig = nuevo;
            ultimo = ultimo.sig;
        }
    }
}
