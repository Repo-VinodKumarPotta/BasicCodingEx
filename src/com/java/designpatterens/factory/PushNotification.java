package com.java.designpatterens.factory;

public class PushNotification implements NotificationInterface {
    @Override
    public void notifyUser(){
        System.out.println ("Push");
    }
}
