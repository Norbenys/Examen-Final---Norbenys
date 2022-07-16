package examen.final_norbe;

/**
 *
 * @author Norbenys
 */
public class NodoEjercicio_Tres {

    NodoEjercicio_Tres sig;

    NodoEjercicio_Tres(String nombre, int opcionCedulación, int opcionCitaPasaporte, int opcionRetiroDocumentos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public class Nodo_Tres {

        String nombre;
        int opcionCedulación;
        int opcionCitaPasaporte;
        int opcionRetiroDocumentos;
        NodoEjercicio_Tres sig;

        public Nodo_Tres(String nombre, int opcionCedulación, int opcionCitaPasaporte, int opcionRetiroDocumentos) {
            this.nombre = nombre;
            this.opcionCedulación = opcionCedulación;
            this.opcionCitaPasaporte = opcionCitaPasaporte;
            this.opcionRetiroDocumentos = opcionRetiroDocumentos;
        }

        public Nodo_Tres() {
        }
    }
}
