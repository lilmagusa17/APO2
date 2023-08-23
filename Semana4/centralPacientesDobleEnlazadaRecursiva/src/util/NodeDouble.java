package util;

public class NodeDouble extends NodeSingle{

    /**
     * referencia para enlazar el anterior
     */
    private NodeDouble anterior;

    /**
     * constructor
     * @param c es un objeto, el contenido del nodo
     */
    public NodeDouble(Object c) {
        super(c);
        anterior = null;
    }

    public NodeDouble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodeDouble anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "Nodo: {" + getContent().toString()+ "}";
    }
}
