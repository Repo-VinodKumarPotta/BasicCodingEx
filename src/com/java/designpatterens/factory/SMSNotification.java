package com.java.designpatterens.factory;

public class SMSNotification implements NotificationInterface {
    @Override
    public void notifyUser(){
        System.out.println ("SMS");
    }
}
