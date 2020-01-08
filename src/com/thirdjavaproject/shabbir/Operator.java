package com.thirdjavaproject.shabbir;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Operators;

public class Operator {

    public static void main (String []agrs){

        System.out.println("Operator homework practice");

        operators();



    }

    public static void operators(){

       int intNumOne = 22;
       int intNumTwo = 33;

       System.out.println( intNumOne + intNumTwo);

       double doubleNumOne = 30.00;
       double doubleNumTwo = 6.0;

       System.out.println ("Reminder" + " " + doubleNumOne % doubleNumTwo);
    }
}
