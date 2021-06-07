package com.java.designpatterens.abstractfactory;

public class EmailFactory implements NotificationType {
    @Override
    public Notification getEmail(String email) {
        if(email == null){
            return null;
        }

        if(email.equalsIgnoreCase ("Personal")){
            return new PersonalEmail();
        } else if(email.equalsIgnoreCase ("Office")){
            return new OfficeEmail();
        }
        return null;
    }

    @Override
    public Notification getSMS(String sms) {

        return null;
    }
}
