package com.java;

interface InterfaceA{
    default void show(){
        System.out.println ("Inter A");
    }
}
interface InterfaceB{
    default void show(){
        System.out.println ("Inter B");
    }
}
public class DefaultMethodsEx implements InterfaceA, InterfaceB {

    public static void main(String[] args) {
        DefaultMethodsEx defaultMethodsEx = new DefaultMethodsEx();
        defaultMethodsEx.show ();
    }

    @Override
    public void show() {
        InterfaceA.super.show ();
        InterfaceB.super.show ();
    }
}
