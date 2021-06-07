package com.java.designpatterens.builder;

public class Main {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setOs ("android").getPhone ();
        System.out.println (p);
    }
}
