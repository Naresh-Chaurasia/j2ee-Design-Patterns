package com.solid.single;

class SMSNotifier implements Notifier {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending SMS: " + message);
    }
}