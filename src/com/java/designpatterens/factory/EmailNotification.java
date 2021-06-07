package com.java.designpatterens.factory;

public class EmailNotification implements NotificationInterface {
    @Override
    public void notifyUser(){
        System.out.println ("Email");
    }
}
