package com.org.xochitl.threads.syncronization;

public class ThreadSynchronizationBlockImpl {
    public static void main(String args[])
    {
        ThreadSynchronizationBlock ts = new ThreadSynchronizationBlock();
        Thread t1 = new Thread(ts);
        Thread t2 = new Thread(ts);
        t1.start();
        t2.start();
    }
}
