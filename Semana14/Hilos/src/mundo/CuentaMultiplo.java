package mundo;
import java.util.Random;

public class CuentaMultiplo implements Runnable {

    public static final int MAX=1000000000;
    private String nombre;
    private int numeroMultiplo;
    private long timeSleep;

    public CuentaMultiplo(String nombre, int numeroMultiplo) {
        this.nombre = nombre;
        this.numeroMultiplo = numeroMultiplo;
        this.timeSleep = new Random().nextInt(10);
        System.out.println("El tiempo de "+nombre+" es "+timeSleep);
    }




    public String getNombre() {
        return nombre;
    }


    public int getNumeroMultiplo() {
        return numeroMultiplo;

    }

    public  int cuantosMultiplos() {
        int contador=0;
        for (int i=0; i<=MAX; i++) {
            if (i%numeroMultiplo==0) {
                contador++;
                System.out.println(nombre+" cuenta "+i);
            }
        }

        return contador;
    }

    @Override
    public  void run(){
        int aux=cuantosMultiplos();
        try {
            Thread.sleep(timeSleep*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hola soy "+nombre+" conteo "+aux);
    }



}
