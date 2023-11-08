package ui;

import model.Counter;
import model.Timer;
import thread.CounterThread;

import java.util.Scanner;

public class InteractiveMain {

    public InteractiveMain(){

    }

    public static void main(String[] args){
        InteractiveMain m1 = new InteractiveMain();
        m1.runApp();
    }

    public void runApp(){

        int num = 0;
        Timer timer = new Timer();
        Scanner sc = new Scanner(System.in);

        System.out.print("Hi! This is a program that counts to 100!!\n Please enter the number of threads you want the program to split into: ");
        num = sc.nextInt();
        CounterThread countThreads[] = new CounterThread[num];

        if(100%num == 0){

          int interval = 100/num;
          int curInterval = 0;

          Counter counter = new Counter(curInterval, curInterval+interval);
          countThreads[0] = new CounterThread(counter, 0);

          curInterval += interval;

          for (int i = 1; i < countThreads.length; i++) {
                counter = new Counter(curInterval, curInterval+interval);
                countThreads[i] = new CounterThread(counter, 0);

                curInterval += interval;
          }

        }else{

            int interval = 100/num;
            int curInterval = 0;

            Counter counter = new Counter(curInterval, curInterval+interval);
            countThreads[0] = new CounterThread(counter, 0);

            curInterval += interval;

            for (int i = 1; i < countThreads.length-1; i++) {
                    counter = new Counter(curInterval, curInterval+interval);
                    countThreads[i] = new CounterThread(counter, 0);

                    curInterval += interval;
            }

            counter = new Counter(curInterval, 100);
            countThreads[countThreads.length-1] = new CounterThread(counter, 0);

        }

        timer.start();

        for (int i = 0; i < countThreads.length; i++) {
            countThreads[i].start();
        }

        for (int i = 0; i < countThreads.length; i++) {
            try {
                countThreads[i].join();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Runtime with "+num+" threads was: "+timer.stop()+" ms");

    }

}
