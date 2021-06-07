package com.java.designpatterens.builder;

public class Phone {

    private String os;
    private String processor;
    private double ram;
    private double battery;
    private int screenSize;

    public Phone(String os, String processor, double ram, double battery, int screenSize) {
        this.os = os;
        this.processor = processor;
        this.ram = ram;
        this.battery = battery;
        this.screenSize = screenSize;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", battery=" + battery +
                ", screenSize=" + screenSize +
                '}';
    }
}
