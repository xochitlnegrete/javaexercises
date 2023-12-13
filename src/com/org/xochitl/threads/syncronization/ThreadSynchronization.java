package com.org.xochitl.threads.syncronization;

class ThreadSynchronization implements Runnable
{
    public void run()
    {
        criticalSection();
    }
    public synchronized void criticalSection()
    {
        String name = Thread.currentThread().getName();
        System.out.println(name+" has entered the Critical Section");
        for(int i=1;i<=3;i++)
            System.out.println("Name of Thread is "+name+" and Value = "+i);
        System.out.println(name+" has exited the Critical Section!\n");
    }
}