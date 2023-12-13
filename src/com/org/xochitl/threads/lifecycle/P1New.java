package com.org.xochitl.threads.lifecycle;

public class P1New implements Runnable {
    @Override
    public void run() {
        System.out.println("[" + Thread.currentThread().getName() + "] run()");
    }
}
