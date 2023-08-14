package util;
import model.Paciente;
public class ListaEnlazada implements Lista{
    /**
     * referencia al primer elemento de la lista
     */
    private Nodo primero;
    /**
     * entero que guarda la cantidad de elementos de la lista
     */
    private int numElementos;

    public ListaEnlazada() {
        primero= null;
        numElementos = 0;
    }

    /**
     * Informa si la lista estA vacIA
     */
    @Override
    public boolean esVacia() {
        return (primero== null);
    }

    @Override
    public void agregarPrimero(Object n) {
        Nodo actual= primero;
        Nodo nuevo = new Nodo(n);
        if(this.esVacia()) { // si la lista es vacia el nuevo es el primero
            primero = nuevo; //asignacion de la referencia del nuevo nodo al primero
            numElementos++;
        }else {
            nuevo.setSiguiente(primero);
            primero = nuevo;
            numElementos++;
        }
    }

    @Override
    public void agregarUltimo(Object content) {
        Nodo actual= primero;
        Nodo nuevo = new Nodo(content);

        if (primero ==null) { //Si la lista es vacIa el nuevo es el primero
            primero = nuevo;
            numElementos++;

        }else { //Se encuentra el ultimo nodo
            while(actual.getSiguiente() != null) {
                actual=actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
            numElementos++;
        }

    }

    @Override
    public Object buscar(Object clave) {
        Object found =  null;
        Nodo actual= primero;

        if (primero !=null) { //Si la lista es no es vacIA se hace el recorrido
//FIXME Preguntar a la profe lo de que la condicion resultaria como always false
            while(actual.getSiguiente() != null && found!=null) {
                if (actual.getContenido().equals(clave))
                    found = actual.getContenido();
                actual=actual.getSiguiente();
            }
            //si se llegO al ultimo nodo y aun no se encuentra la clave
            if (actual.getSiguiente()==null && found==null) {
                if (actual.getContenido().equals(clave)) //buscando en el ultimo nodo
                    found = actual.getContenido();
            }
        } // si la lista es vacía no se hace nada

        return found;
    }

    @Override
    public void eliminar(Object clave) {
        // FIXME desconectar el nodo encontrado y conectar el anterior a este con el que sigue
      Nodo actual= primero;

      while(primero != null){
            if(buscar(clave) == primero.getContenido()) {
                primero = primero.getSiguiente();
                numElementos--;
            }
            primero = primero.getSiguiente();
      }

    }

    public String toString() {
        String out = "size: " + numElementos + " [";
        Nodo actual = primero;

        if (primero != null) { //si la lista no es vacia
            while (actual.getSiguiente() != null) {
                out += actual.toString() + " ";
                actual = actual.getSiguiente();
            }
            out += actual.toString(); //se incluye el ultimo

        }//Si la lista es vacIa no se hace nada

        return out + "]";
    }

}
