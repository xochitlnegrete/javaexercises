package com.org.xochitl.threads.syncronization;

class ThreadSynchronizationBlock implements Runnable
{
    public void run()
    {
        int count = 0;
        System.out.println("Counter: " + count);
        synchronized(this)
        {
            String name = Thread.currentThread().getName();
            System.out.println(name+" has entered the Synchronized Block");
            for(int i=1 ;i<=3;i++)
                System.out.println("Count = "+(++count));
            System.out.println(name+" has exited the Synchronized Block\n");
        }
    }
}