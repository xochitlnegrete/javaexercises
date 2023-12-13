package com.org.xochitl.threads.lifecycle;

public class P1NewImpl {
    public static void main(String[] args)
    {
        P1New tlc = new P1New();
        Thread t = new Thread(tlc);
        System.out.println("Thread State : "+t.getState());
    }
}
