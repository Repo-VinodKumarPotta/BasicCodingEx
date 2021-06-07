package com.java;

public class OverridingClassB extends OverridingClassA {

    public static void methodOne(){
        System.out.println ("OverridingClassB");
    }

    public static void main(String[] args) {
        OverridingClassA.methodOne ();

        System.out.println("Statement 1");
        try
        {
            System.out.println(10/0);
        }
        catch (ArithmeticException e)
        {
            System.out.println(10/2);
        }
        System.out.println("Statement 2");
    }
}
