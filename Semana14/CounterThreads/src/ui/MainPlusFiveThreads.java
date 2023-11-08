package ui;

import model.Counter;
import model.Timer;
import thread.CounterThread;

import java.sql.Time;

public class MainPlusFiveThreads {

    public MainPlusFiveThreads(){

    }

    public static void main(String[] args){
        MainPlusFiveThreads m1 = new MainPlusFiveThreads();
        m1.runApp();
    }

    public void runApp(){
        System.out.println("Count to 100 with 5 threads\n");

        Timer timer = new Timer();
        CounterThread ct[] = new CounterThread[5];
        for (int i = 0; i < ct.length; i++) {
            Counter counter = new Counter(20*i, 20*i+20);
            ct[i] = new CounterThread(counter, 0);
        }

        timer.start();

        for (int i = 0; i < ct.length; i++) {
            ct[i].start();
        }
        for (int i = 0; i < ct.length; i++) {
            try {
                ct[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Run time with 5 threads was: "+timer.stop()+" ms\n");

    }

}
