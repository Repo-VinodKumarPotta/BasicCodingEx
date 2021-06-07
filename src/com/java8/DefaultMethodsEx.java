package com.java8;

interface Interface1{
    default void show() {
        System.out.println ("Interface1 :: show()");
    }
}

interface Interface2{
    default void show() {
        System.out.println ("Interface2 :: show()");
    }
}

public class DefaultMethodsEx implements Interface1, Interface2{

    @Override
    public void show() {
        System.out.println ("DefaultMethodsEx :: show()");
        Interface1.super.show ();
        Interface2.super.show ();
    }

    public static void main(String[] args) {
        DefaultMethodsEx defaultMethodsEx = new DefaultMethodsEx ();
        defaultMethodsEx.show ();
    }


}
