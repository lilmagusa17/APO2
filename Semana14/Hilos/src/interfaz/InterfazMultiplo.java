package interfaz;

import mundo.*;


public class InterfazMultiplo {

    private CuentaMultiplo m7;
    private CuentaMultiplo m5;
    private CuentaMultiplo m2;

    public InterfazMultiplo() {
        m7 = new CuentaMultiplo("Domi", 7);
        m5 = new CuentaMultiplo("Nico", 5);
        m2 = new CuentaMultiplo("Marlon", 2);
    }

    public void imprimirCantidadMultiplo(CuentaMultiplo n, int numero) {
        System.out.println(n.getNombre() + " tiene " + n.cuantosMultiplos() + " multiplos de " + numero);

    }

    public void contarMultiplos(){
        imprimirCantidadMultiplo(m5,m5.getNumeroMultiplo());
        imprimirCantidadMultiplo(m7,m7.getNumeroMultiplo());
        imprimirCantidadMultiplo(m2,m2.getNumeroMultiplo());

        Thread t1 = new Thread(m7);
        Thread t2 = new Thread(m5);
        Thread t3 = new Thread(m2);

        t1.start();
        t2.start();
        t3.start();

    }


    public static void main(String[] args) {
        InterfazMultiplo interfaz = new InterfazMultiplo();
        interfaz.contarMultiplos();
    }




}



