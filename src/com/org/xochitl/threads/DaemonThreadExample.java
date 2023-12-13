package com.org.xochitl.threads;

public class DaemonThreadExample {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("[A] Anonymous Thread execution");

        Thread thread = new Thread(runnable);
        thread.start();

        System.out.println(thread.isDaemon());
        thread.setDaemon(true);
        System.out.println(thread.isDaemon());
    }
}
