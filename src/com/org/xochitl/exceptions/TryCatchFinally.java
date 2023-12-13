package com.org.xochitl.exceptions;

import java.util.Scanner;

public class TryCatchFinally {

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int num,den;
        double ans;
        System.out.println("Enter numerator");

        num = sc.nextInt();
        System.out.println("Enter denominator");

        den = sc.nextInt();
        try{
            ans = (double) num /den ;
            System.out.println("Division("+num+"/"+den+") = "+ans);
        }
        catch(ArithmeticException e){
            System.out.println("Exception occurred!");
        }
        finally{
            System.out.println("Finally block executed");
        }
    }
}