package com.org.xochitl.threads.lifecycle;

public class P6TerminatedImpl {
    public static void main(String[] args) throws InterruptedException    {
        P6Terminated tlc = new P6Terminated();
        Thread t1 = new Thread(tlc);
        t1.setName("Thread(1)");
        t1.start();
        Thread.sleep(1000);
        System.out.println(t1.getName()+" in main and is in "+t1.getState()+" state");
    }
}
