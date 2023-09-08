package util;

public class LinkedListRecursive implements Lista{
    private NodeDouble first;
    private NodeDouble last;
    private int numItems;

    public LinkedListRecursive(){
        numItems = 0;
    }

    @Override
    public boolean isEmpty() {
        return (first == null) && (last == null);
    }

    @Override
    public void addFirst(Object n) {
        //

    }

    @Override
    public void addLast(Object n) {

    }

    @Override
    public Object search(Object clave) {
        return null;
    }

    public String searchNode() {
        String out = "";
        if(isEmpty()){
            out+= "]";
        }else{
            out+= searchNodeSequence(first) + "]";
        }
        return out;

    }

    public Object searchNodeSequence(NodeDouble n, Object search){
        Object out = null;
        if(n==null){
            out = null;
        }else{
            if(n.getContent().equals(search)){
                out = n.getContent();
            }else{
                out = searchNodeSequence(n.getNext(), search);
            }
        }
        return out;
    }

    @Override
    public void delete(Object clave) {

    }

    public String print(){
        String out = "";
        if(isEmpty()){
            out+= "]";
        }else{
            out+= printNodeSequence(first) + "]";
        }
        return out;
    }

    private String printNodeSequence(NodeDouble n){
        String out = "";
        if(first==null) {
            out += "-";
        }else{
            out += first.getContent() + printNodeSequence(first.getNext());
        }
        return out;
    }
}
