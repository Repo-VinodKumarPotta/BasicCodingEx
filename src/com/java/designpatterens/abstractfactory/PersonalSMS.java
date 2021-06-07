package com.java.designpatterens.abstractfactory;

public class PersonalSMS implements Notification {
    @Override
    public String pushNotification() {
        return "Push notification to personal mobile";
    }
}
