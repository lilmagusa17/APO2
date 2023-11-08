package ui;
import thread.CounterThread;
import java.util.Scanner;
import model.Timer;
import model.Counter;
 
public class InteractiveMain {

    public InteractiveMain() {
    }

    public static void main(String[] args) {
        InteractiveMain m1 = new InteractiveMain();
        m1.execute();
    }

    public void execute(){

        int number = 0;
        Timer timer = new Timer();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero de hilos que desea usar: ");
        number = sc.nextInt();
        CounterThread counterThread[] = new CounterThread[number];
        int amount=100/number;

        for (int i = 0; i < counterThread.length; i++) {
            Counter counter = new Counter(amount*i, amount*i+amount);
            counterThread[i] = new CounterThread(counter, 0);
        }
        timer.start();

        for (int i = 0; i < counterThread.length; i++) {
            counterThread[i].start();
        }

        for (int i = 0; i < counterThread.length; i++) {
            try {
                counterThread[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Time: "+timer.stop()+" ms");
    }


}
