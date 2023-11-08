package model;

public class Timer {
    //Dedicatoria: Gracias Oscar
    private long startTime;
    public void start() {
        startTime = System.currentTimeMillis();
    }

    public long stop() {
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
