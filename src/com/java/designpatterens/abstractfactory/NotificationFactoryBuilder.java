package com.java.designpatterens.abstractfactory;

public class NotificationFactoryBuilder {

    public static NotificationType getNotificationType(String notofication){
        if(notofication.equals ("email")){
            return new EmailFactory();
        } else if (notofication.equals ("sms")){
            return new SMSFactory();
        }
        return null;
    }
}
