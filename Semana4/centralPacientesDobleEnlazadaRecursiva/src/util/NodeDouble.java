package util;

public class NodeDouble {

    /**
     * referencia para enlazar el anterior
     */
    private NodeDouble prev;
    private NodeDouble next;

    private Object content;

    /**
     * constructor
     * @param c es un objeto, el contenido del nodo
     */
    public NodeDouble(Object c) {
        content = c;
        next = null;
    }

    public NodeDouble getPrev() {
        return prev;
    }

    public void setPrev(NodeDouble prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "Node: {" + content.toString()+ "}";
    }

    public Object getContent() {
        return content;
    }


    public void setContent(Object p) {
        content = p;
    }


    public NodeDouble getNext() {
        return next;
    }

    public void setNext(NodeDouble next) {
        this.next = next;
    }

}
