package com.java8;

import java.util.function.IntToDoubleFunction;

public class FunctionInterfaceEx {
    public static void main(String[] args) {
        IntToDoubleFunction i = (x) -> {return x;};
        System.out.println(i.applyAsDouble(2));
    }
}
