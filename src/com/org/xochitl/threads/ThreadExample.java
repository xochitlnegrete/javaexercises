package com.org.xochitl.threads;

public class ThreadExample extends Thread {
    public static void main(String[] args) throws InterruptedException {
        TThread tThread = new TThread();
        tThread.start();
        //tThread.join();

        Thread rThread = new Thread(new RThread());
        rThread.start();

        Thread rThread2 = new Thread(new RThread());
        rThread2.start();
        //rThread.join();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(3000);
                    System.out.println("[A] Anonymous Thread execution");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread ARThread = new Thread(runnable);
        ARThread.start();
        if(!ARThread.isAlive()) {
            ARThread.start();
        }
        ARThread.join();

        System.out.println("[M] Main Thread execution");
    }
}
