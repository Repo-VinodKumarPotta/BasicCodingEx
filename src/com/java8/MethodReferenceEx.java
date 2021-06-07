package com.java8;

import java.util.Arrays;
import java.util.List;


interface MyParserInterface {
    String parse(String name);
}
class MyParser {

    public static String convert(String name) {

        if (name.length ( ) <= 3)
            name = name.toUpperCase ( );
        else
            name = name.toLowerCase ( );
        return name;
    }
}

class MyPrinter {
    public static void print(String name, MyParserInterface p) {
        name = p.parse (name);
        System.out.println (name);
    }
}

public class MethodReferenceEx {
    public static void main(String[] args) {
        /*
        *Basic example
        List<String > names = Arrays.asList ("Vinod", "Priya", "Abhi");
        names.forEach (System.out::println);
         */
        /*
         * Advanced example
         */
        String name = "Vinod";

/* Traditional
        MyPrinter myPrinter = new MyPrinter ();
        myPrinter.print (name, new MyParserInterface(){
            @Override
            public String parse(String name) {
                return MyParser.convert (name);
            }
        });
*/

/* Lamba
        MyPrinter myPrinter = new MyPrinter ();
        myPrinter.print (name, (x -> MyParser.convert (x)));
*/

/* Method Reference
MyPrinter myPrinter = new MyPrinter ();
myPrinter.print (name, MyParser::convert);
*/


    }

}
