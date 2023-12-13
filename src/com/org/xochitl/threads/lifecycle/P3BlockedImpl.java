package com.org.xochitl.threads.lifecycle;

public class P3BlockedImpl {
    public static void main(String[] args) throws InterruptedException
    {
        P3Blocked tlc = new P3Blocked();
        Thread t1 = new Thread(tlc);
        t1.setName("Thread(1)");
        tlc.t2.setName("Thread(2)");
        t1.start();
        Thread.sleep(100);
        tlc.t2.start();
    }
}
