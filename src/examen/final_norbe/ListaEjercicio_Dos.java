package examen.final_norbe;

/**
 *
 * @author Norbenys
 */
public class ListaEjercicio_Dos {

    nodo L = null;

    public ListaEjercicio_Dos() {
        nodo L = null;
    }

    public boolean isEmpty() {
        return this.L == null;
    }

    public void insert(nodo in) {
        if (this.isEmpty()) {
            this.L = in;
        } else {
            nodo aux = this.L;
            while (aux.next != null) {
                aux = aux.next;
            }
            aux.next = in;
        }
    }

    public void destroy(String in) {
        nodo aux = this.L;
        nodo aux2 = null;

        while (aux.next != null || !aux.dato.equals(in)) {
            aux2 = aux;
            aux = aux.next;
        }
        if (aux.dato.equals(in)) {
            if (aux == L && aux.dato.equals(in)) {
                L = L.next;
            } else {
                aux2.next = aux.next;
            }
        } else {
            System.out.println("No se encontro el valor");
        }
    }

    public String imprimir() {
        nodo aux = L;
        String Dato = "";
        if (this.isEmpty()) {
            Dato = "Esta lista está vacía";
        } else {
            while (aux != null) {
                Dato += "\n" + aux.dato;
                aux = aux.next;
            }
        }
        return Dato;
    }

}

class nodo {

    String dato;
    nodo next;

    public nodo(String in) {
        this.dato = in;
        this.next = null;
    }

    nodo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
    

