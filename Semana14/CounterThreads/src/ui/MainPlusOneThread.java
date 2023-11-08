package ui;

import model.Counter;
import model.Timer;
import thread.CounterThread;

public class MainPlusOneThread {

    public MainPlusOneThread(){

    }

    public static void main(String[] args){
        MainPlusOneThread m1 = new MainPlusOneThread();
        m1.runApp();
    }

    public void runApp(){

        System.out.println("Count to 100 with 2 threads\n");
        Timer timer = new Timer();

        Counter count = new Counter(0, 100);

        CounterThread counterThread = new CounterThread( count,0);
        timer.start();
        counterThread.start();
        try {
            counterThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Run time with 2 threads was: "+timer.stop()+" ms\n");


    }

}
