package ui;

import thread.CounterThread;
import model.Counter;
import model.Timer;
public class OnlyMainThread {

    public OnlyMainThread() {
    }

    public static void main(String[] args) {
        OnlyMainThread m1 = new OnlyMainThread();
        m1.execute();
    }

    public void execute(){
        Timer timer = new Timer();
        OnlyMainThread m1 = new OnlyMainThread();
        Counter counter = new Counter(0, 100);
        timer.start();
        counter.count();
        System.out.println("Time: "+timer.stop()+" ms");
    }






}
