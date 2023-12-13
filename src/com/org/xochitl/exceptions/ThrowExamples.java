package com.org.xochitl.exceptions;

import java.util.Scanner;

public class ThrowExamples {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number");
        int month = sc.nextInt();
        try
        {
            if(month<1 || month>6)  {
                throw new ArithmeticException();
            } else if (month < 6)    {
                throw  new MyException("The month should be after July");
            } else
                System.out.println("You've entered a valid month number");
        }
        catch(ArithmeticException e)     {
            System.out.println(month+ " is an Invalid Month Number!!!");
        }
        catch(MyException e)    {
            System.out.println("Plz try AGAIN!!!");
        }
    }
}

class MyException extends Exception
{
    MyException(String str){
        System.out.println(str);
    }
}