package com.org.xochitl.threads;

public class RThread implements Runnable {
    @Override
    public void run() {
        synchronized (ThreadExample.class)  {
            for (int i = 0; i < 10; i++) {
                System.out.println("[R] Runnable Thread execution: " +i);
            }
        }
    }
}
