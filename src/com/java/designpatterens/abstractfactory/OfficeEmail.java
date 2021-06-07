package com.java.designpatterens.abstractfactory;

public class OfficeEmail  implements Notification{
    @Override
    public String pushNotification() {
        return "Send push notification for office email";
    }
}
