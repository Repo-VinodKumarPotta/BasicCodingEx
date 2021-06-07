package com.java.designpatterens.builder;

public class PhoneBuilder {

    private String os;
    private String processor;
    private double ram;
    private double battery;
    private int screenSize;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setRam(double ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setBattery(double battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setScreenSize(int screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public Phone getPhone(){
        return new Phone (os,processor,ram,battery,screenSize);
    }




}
