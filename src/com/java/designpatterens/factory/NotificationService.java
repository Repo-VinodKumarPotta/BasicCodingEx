package com.java.designpatterens.factory;

public class NotificationService {

    public static void main(String[] args) {
       NotificationFactory notificationFactory = new NotificationFactory ();
       NotificationInterface notificationInterface = notificationFactory.getInstance ("push");
       notificationInterface.notifyUser ();
    }
}
