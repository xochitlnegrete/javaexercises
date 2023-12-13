package com.org.xochitl.threads.lifecycle;

public class P4Waiting implements Runnable{
    public void run()
    {
        String name = Thread.currentThread().getName();
        String state = Thread.currentThread().getState().toString();
        System.out.println(name + " is inside run() of class P3Waiting and state = " + state);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ignored){}
        System.out.println(P4WaitingImpl.t1.getName() + " is in "+ P4WaitingImpl.t1.getState() + " state");
    }
}