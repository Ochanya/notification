package com.company;

import java.time.LocalDateTime;

public class TextNotification extends Notification {

    private String recipient;
    private String smsProvider;


    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
    }

    @Override
    public void transport() {
        System.out.println("the recipient: " + recipient + "the smtProvider: " + smsProvider + " created on: " + getCreatedAt() + "subject: " + getSubject() + "Contents: " + getBody());
    }
    email.printOut();
}
