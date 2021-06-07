package com.java.designpatterens.abstractfactory;

public interface NotificationType {
    public Notification getEmail(String email);
    public Notification getSMS(String sms);

}
