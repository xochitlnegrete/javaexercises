package com.org.xochitl.threads.lifecycle;

public class P5TimeWaiting implements Runnable
{
    public void run()
    {
        try{
            System.out.println("Waiting 3 seconds on P5TimeWaiting");
            Thread.sleep(3000);
        }
        catch(InterruptedException ignored){}
    }
}