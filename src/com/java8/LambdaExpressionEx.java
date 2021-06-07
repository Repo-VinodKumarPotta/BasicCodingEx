package com.java8;

interface A{
    void show();
}

/*
class AImpl implements A{
    @Override
    public void show() {
        System.out.println ("This is show method");
    }
}
*/

public class LambdaExpressionEx {

    public static void main(String[] args) {
        A obj;
     /*     obj = new AImpl();
        obj.show ();*/

/*     obj = new A(){
         @Override
         public void show() {
             System.out.println ("This is show method");
         }
     };*/

       obj = () -> {
            System.out.println ("This is show method");
        };
       obj.show ();
    }
}
