package com.org.xochitl.threads.lifecycle;

public class P4WaitingImpl implements Runnable {
    public static Thread t1;
    public static void main(String[] args) throws InterruptedException    {
        P4WaitingImpl m = new P4WaitingImpl();
        t1 = new Thread(m);
        t1.setName("Thread(1)");
        t1.start();
    }
    public void run()    {
        P4Waiting tlc = new P4Waiting();
        Thread t2 = new Thread(tlc);
        t2.setName("Thread(2)");
        t2.start();
        String name = Thread.currentThread().getName();
        String state = Thread.currentThread().getState().toString();
        System.out.println(name + " is inside run() of class P3WaitingImpl and state = " + state);
        try{
            t2.join();
        }
        catch(InterruptedException ignored){}
    }
}