package util;

public class NodeSingle {

    /**
     * Objeto del nodo
     */
    private Object content;
    /**
     * referencia para enlazar el siguiente
     */
    private NodeSingle siguiente;

    /**
     * constructor
     * @param c es un objeto, el contenido del nodo
     */
    public NodeSingle(Object c) {
        content = c;
        siguiente = null;
    }


    public Object getContent() {
        return content;
    }


    public void setContent(Object p) {
        content = p;
    }


    public NodeSingle getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodeSingle siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Nodo: {" + content.toString()+ "}";
    }


}
