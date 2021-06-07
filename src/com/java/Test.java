package com.java;

import java.io.PrintStream;
import java.util.List;


public class Test {

    // @Override
    public static void ThreadStatus() {
        System.out.println ("Thread is running...");
    }

    public static void main(String[] args) {
        Thread t2 = new Thread (Test::ThreadStatus);
        t2.start ( );

        //List
    }
}
