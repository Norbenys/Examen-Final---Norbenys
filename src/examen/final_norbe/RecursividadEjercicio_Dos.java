package examen.final_norbe;

/**
 *
 * @author Norbenys
 */
public class RecursividadEjercicio_Dos {

    public static nodo Cargarlista(int n, String[] p, ListaEjercicio_Dos x) {

        if (n <= p.length - 1) {
            x.insert(new nodo(p[n]));
            n++;
            x.insert(RecursividadEjercicio_Dos.Cargarlista(n, p, x));
        }

        return null;

    }
}
