package com.org.xochitl.threads;

public class TThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("[T] Thread Thread execution: " +i);
        }
    }
}
