package com.java.designpatterens.abstractfactory;

public class SMSFactory implements NotificationType {
    @Override
    public Notification getEmail(String email) {
        return null;
    }

    @Override
    public Notification getSMS(String sms) {
        if(sms == null){
            return null;
        }

        if(sms.equalsIgnoreCase ("Personal")){
            return new PersonalSMS();
        } else if(sms.equalsIgnoreCase ("Office")){
            return new OfficeSMS();
        }
        return null;
    }
}
