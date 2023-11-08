package ui;

import model.Counter;
import model.Timer;

public class OnlyMainThread {


    public OnlyMainThread(){

    }

    public static void main(String[] args){
        OnlyMainThread m1 = new OnlyMainThread();
        m1.runApp();
    }

    public void runApp(){
        Timer timer = new Timer();
        System.out.println("Count to 100 with 1 thread\n");
        Counter counter = new Counter(0, 100);
        counter.count();

        System.out.println("Runtime with 1 thread was: " + timer.stop() + " ms");

    }


}
