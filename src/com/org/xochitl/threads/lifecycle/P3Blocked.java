package com.org.xochitl.threads.lifecycle;

public class P3Blocked implements Runnable
{
    Thread t2;
    P3Blocked(){
        t2 = new Thread(this);
    }
    public synchronized void run(){
        String name = Thread.currentThread().getName();
        String state = Thread.currentThread().getState().toString();
        System.out.println(name+" is inside run() of class P3Blocked and state = "+state);
        for(int i=1;i<=3;i++)
        {
            if(Thread.currentThread().getName().equals("Thread(1)"))
                System.out.println(t2.getName()+" is "+t2.getState());
            System.out.println(" value = "+i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException ignored){
                System.out.println(Thread.currentThread().getName() + " has had an InterruptedException");
            }
        }
    }
}
