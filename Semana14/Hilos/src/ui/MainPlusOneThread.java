package ui;
import thread.CounterThread;
import model.Counter;
import model.Timer;


public class MainPlusOneThread {


    public MainPlusOneThread() {
    }

    public static void main(String[] args) {
        MainPlusOneThread m1 = new MainPlusOneThread();
        m1.execute();
    }

    public void execute(){
        Timer timer = new Timer();
        MainPlusOneThread m1 = new MainPlusOneThread();
        Counter counter2 = new Counter(0, 100);

        CounterThread counterThread = new CounterThread( counter2,0);
        timer.start();
        counterThread.start();
        try {
            counterThread.join(); // Espera a que el hilo counterThread termine
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Time: "+timer.stop()+" ms");
    }

}
