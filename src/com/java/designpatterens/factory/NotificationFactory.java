package com.java.designpatterens.factory;

public class NotificationFactory {
    public NotificationInterface getInstance(String str){
        if(str.equals ("push")){
            return new PushNotification ();
        } else if (str.equals ("sms")){
            return new SMSNotification ();
        }  else {
            return new EmailNotification ();
        }
    }

}
