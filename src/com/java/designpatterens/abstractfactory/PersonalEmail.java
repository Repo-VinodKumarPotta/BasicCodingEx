package com.java.designpatterens.abstractfactory;

public class PersonalEmail implements Notification{
    @Override
    public String pushNotification() {
        return "Send push notification for personal email";
    }
}
