package com.java;

interface InterfaceA{
    default void show(){
        System.out.println ("Inter");
    }
}

public class DefaultMethodsEx implements InterfaceA {

  /*  @Override
    public void show(){
        System.out.println ("Class");
    }*/

    public static void main(String[] args) {
        InterfaceA interfaceA = new DefaultMethodsEx();
        interfaceA.show ();
    }
}
