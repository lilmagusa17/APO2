package util;

import model.CuentaMultiplo;
import thread.HiloCuentaMultiplo;

public class InterfazMultiplo {
    private CuentaMultiplo m5;
    private CuentaMultiplo m7;
    private CuentaMultiplo m2;

    private HiloCuentaMultiplo hm5;
    private HiloCuentaMultiplo hm7;
    private HiloCuentaMultiplo hm2;

    public InterfazMultiplo(){
        m5 = new CuentaMultiplo("Nico", 5);
        m7 = new CuentaMultiplo("Domi", 7);
        m2 = new CuentaMultiplo("Marlon", 2);

        hm5 = new HiloCuentaMultiplo(this, m5);
        hm7 = new HiloCuentaMultiplo(this, m7);
        hm2 = new HiloCuentaMultiplo(this, m2);
    }

    public void imprimirCantidadMultiplos(CuentaMultiplo cuentaMultiplo,
                                          int numero){
        System.out.println(cuentaMultiplo.darNombre() +
                " cuenta " + numero + " multiplos de " +
                cuentaMultiplo.darNumeroMultiplo());
    }

    public void contarMultiplos(){

        Thread hilo1 = new Thread(m7);
        Thread hilo2 = new Thread(m5);
        Thread hilo3 = new Thread(m2);

        hilo1.start();
        hilo2.start();
        hilo3.start();

       /* m7.start();
        m5.start();
        m2.start();

         */

    }

    public static void main(String[] args){
        InterfazMultiplo interfaz = new InterfazMultiplo();
        interfaz.contarMultiplos();

    }
}
