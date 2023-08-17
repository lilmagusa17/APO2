package util;

public interface Lista {
    public boolean isEmpty();
    public void addFirst(Object n);
    public void addLast(Object n);
    public Object search(Object clave);
    public void delete(Object clave);
}
