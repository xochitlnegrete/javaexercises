package com.org.xochitl.threads.syncronization;

public class ThreadSynchronizationImpl {
    public static void main(String args[])
    {
        ThreadSynchronization ts = new ThreadSynchronization();
        Thread t1 = new Thread(ts);
        Thread t2 = new Thread(ts);
        t1.start();
        t2.start();
    }
}
