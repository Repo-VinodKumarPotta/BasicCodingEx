package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceEx {
    public static void main(String[] args) {
        List<String > names = Arrays.asList ("Vinod", "Priya", "Abhi");
        /*
        *Traditional Way
        Consumer<String > consumer = new Consumer<String> ( ) {
            @Override
            public void accept(String s) {
                System.out.println (s);
            }
        };
        names.forEach (consumer);*/

        /*
        *Lambda
        names.forEach ((s) -> System.out.println (s));
        */


        //Method reference
        names.forEach (System.out::println);

    }
}
