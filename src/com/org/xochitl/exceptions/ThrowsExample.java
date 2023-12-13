package com.org.xochitl.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsExample {
    public static void main(String[] args) throws FileNotFoundException
    {
        ThrowsExample obj = new ThrowsExample();
        obj.fileRead(); //comment this line when using try-catch

//Uncomment below lines to handle the exception using try-catch
       /*try
         {
             obj.fileRead();
         }
         catch(FileNotFoundException e)
         {
             System.out.println(e.toString()+ "\nException handled using try-catch!!!");
         }*/
    }

    public void fileRead() throws FileNotFoundException    {
        File file = new File("C:\\File.txt");
        FileReader fr = new FileReader(file);
    }
}