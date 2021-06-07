package com.java.designpatterens.abstractfactory;

public class NotificationService {

    public static void main(String[] args) {
       NotificationType notificationType = NotificationFactoryBuilder.getNotificationType ("email");
       Notification notification = notificationType.getEmail ("Personal");
       System.out.println (notification.pushNotification ());

       Notification notification1 = notificationType.getEmail ("Office");
       System.out.println (notification1.pushNotification ());

    }
}
