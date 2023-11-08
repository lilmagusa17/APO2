package model;

import java.util.Random;

public class CuentaMultiplo implements Runnable{

    public static final int MAX = 1000000000;
    public String nombre;
    public int numeroMultiplo;

    private int timeSleep;

    public CuentaMultiplo(String string, int num){
        this.nombre = string;
        this.numeroMultiplo = num;
        this.timeSleep = new Random().nextInt(10);
    }

    public String darNombre(){

        return this.nombre;
    }

    public int darNumeroMultiplo(){
        return this.numeroMultiplo;
    }

    public int cuantosMultiplos(){
        int count =0;

        for(int i=0; i <MAX; i++){
            if(i%numeroMultiplo==0){
                count++;
                //System.out.println(this.nombre + " num -> " +i);
            }
            //System.out.println(this.nombre + " num -> " +i);
        }
        return count;
    }

    public void run(){

        int cantidad = cuantosMultiplos();

        try {
            int time=this.timeSleep*1000;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hola soy "  + this.nombre + " contE: " + cantidad + " multiplos de " + this.numeroMultiplo + " Tiempo espera: " + this.timeSleep);


    }

}
