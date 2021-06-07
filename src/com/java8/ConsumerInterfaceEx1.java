package com.java8;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.ObjDoubleConsumer;

public class ConsumerInterfaceEx1 {
    public static void main(String[] args) {

        IntConsumer ic = i -> System.out.println (i);
        ic.accept (10 );

        DoubleConsumer dc = i -> System.out.println (i);
        dc.accept (10.10);

        ObjDoubleConsumer<String> odc  = (s, d)->System.out.println(s+d);
        odc.accept("java2s.com ",0.1234);


    }
}
