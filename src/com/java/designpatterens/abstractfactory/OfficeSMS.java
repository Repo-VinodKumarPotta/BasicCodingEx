package com.java.designpatterens.abstractfactory;

public class OfficeSMS implements Notification {
    @Override
    public String pushNotification() {
        return "Push notification to office mobile";
    }
}
