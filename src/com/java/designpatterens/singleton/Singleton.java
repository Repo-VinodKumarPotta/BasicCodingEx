package com.java.designpatterens.singleton;


public class Singleton {

    private static Singleton singleton = null;

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton ();
        }
        return singleton;
    }

    public static void main(String[] args) {
        Singleton s = getInstance ();
        System.out.println (s);
        Singleton s1 = getInstance ();
        System.out.println (s1);
        Singleton s2 = getInstance ();
        System.out.println (s2);
    }
}
