package com.org.xochitl.threads.lifecycle;

public class P2RunnableImpl {
    public static void main(String args[])
    {
        P2Runnable tlc = new P2Runnable();
        Thread t = new Thread(tlc);
        t.setName("Thread(1)");
        t.start();
        System.out.println(t.getName()+" State : "+t.getState());
    }
}
