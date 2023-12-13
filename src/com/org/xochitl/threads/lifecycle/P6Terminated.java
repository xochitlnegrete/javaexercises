package com.org.xochitl.threads.lifecycle;

public class P6Terminated implements Runnable{
    public void run()    {
        try{
            Thread.sleep(10);
        }
        catch(InterruptedException ignored){}
    }
}