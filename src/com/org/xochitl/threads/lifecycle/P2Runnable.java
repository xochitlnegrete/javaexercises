package com.org.xochitl.threads.lifecycle;

public class P2Runnable implements Runnable {
    @Override
    public void run() {
        System.out.println("[" + Thread.currentThread().getName() + "] run()");
    }
}
