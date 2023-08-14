package util;

public interface Lista {
    public boolean esVacia();
    public void agregarPrimero(Object n);
    public void agregarUltimo(Object n);
    public Object buscar(Object clave);
    public void eliminar(Object clave);
}
