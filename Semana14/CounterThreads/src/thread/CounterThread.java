package thread;

import model.Counter;

public class CounterThread extends Thread{

    private long sleepMillis;
    private Counter counter;

    public CounterThread(Counter counter, long millis){
        this.sleepMillis = millis;
        this.counter = counter;

    }

    @Override
    public void run(){
        counter.count();
    }

}
