package util;

public class SingleLinkedList implements Lista {
    /**
     * referencia al primer elemento de la lista
     */
    private NodeSingle first;
    private NodeSingle last;
    /**
     * entero que guarda la cantidad de elementos de la lista
     */
    private int numItems;

    public SingleLinkedList() {
        first = null;
        numItems = 0;
    }

    /**
     * Informa si la lista estA vacIA
     */
    @Override
    public boolean isEmpty() {
        return (first == null);
    }

    @Override
    public void addFirst(Object n) {
        NodeSingle current = first;
        NodeSingle newNode = new NodeSingle(n);
        if (this.isEmpty()) { // si la lista es vacia el newNode es el primero
            first = newNode; //asignacion de la referencia del newNode nodo al primero
            numItems++;
        } else {
            newNode.setSiguiente(first);
            first = newNode;
            numItems++;
        }
    }

    @Override
    public void addLast(Object content) {
        NodeSingle current = first;
        NodeSingle newNode = new NodeSingle(content);

        if (first == null) { //Si la lista es vacIa el nuevo es el primero
            first = newNode;
            numItems++;
        } else { //Se encuentra el ultimo nodo
            while (current.getSiguiente() != null) {
                current = current.getSiguiente();
            }
            current.setSiguiente(newNode);
            numItems++;
        }

    }

    @Override
    public Object search(Object clave) {
        Object found = null;
        NodeSingle current = first;

        if (first != null) { //Si la lista es no es vacIA se hace el recorrido
            while (current.getSiguiente() != null && found == null) {
                if (current.getContent().equals(clave))
                    found = current.getContent();
                current = current.getSiguiente();
            }
            //si se llegO al ultimo nodo y aun no se encuentra la clave
            if (current.getSiguiente() == null && found == null) {
                if (current.getContent().equals(clave)) //buscando en el ultimo nodo
                    found = current.getContent();
            }
        } // si la lista es vacía no se hace nada

        return found;
    }

    @Override
    public void delete(Object clave) {
        if (first != null) {
            NodeSingle actual, anterior;
            anterior = first;
            actual = first.getSiguiente();
            boolean found = false;

            if (first.getContent().equals(clave)) { //quiero eliminar el primero
                first = actual;
                numItems--;
            } else {
                //Se hace el recorrido hasta encontrar el nodo
                while (actual != null && !found) {
                    if (actual.getContent().equals(clave)) {
                        found = true;
                        anterior.setSiguiente(actual.getSiguiente());
                        actual.setSiguiente(null);
                        numItems--;
                    }
                    actual = actual.getSiguiente();
                    anterior = anterior.getSiguiente();
                }
            }
        }
    }

    public void ingresarAtencionPaciente(Object code){

    }

    public void consultarTurno(Object code){

    }


    public String toString() {
        String out = "size: " + numItems + " [";
        NodeSingle actual = first;

        if (first != null) { //si la lista no es vacia
            while (actual.getSiguiente() != null) {
                out += actual.toString() + " ";
                actual = actual.getSiguiente();
            }
            out += actual.toString(); //se incluye el ultimo

        }//Si la lista es vacIa no se hace nada

        return out + "]";
    }

}
