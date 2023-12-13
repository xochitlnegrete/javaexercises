package com.org.xochitl.threads.lifecycle;

public class P5TimeWaitingImpl {
    public static Thread t1;
    public static void main(String[] args) throws InterruptedException    {
        P5TimeWaiting tlc = new P5TimeWaiting();
        Thread t1 = new Thread(tlc);
        t1.setName("Thread(1)");
        t1.start();
        System.out.println("Waiting one second on P5TimeWaitingImpl");
        Thread.sleep(5000);
        System.out.println(t1.getName() + " in P5TimeWaitingImpl and is in " + t1.getState() + " state");
    }
}
