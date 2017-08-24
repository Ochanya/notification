package com.company;

import java.time.LocalDateTime;

public class EmailNotification extends Notification {

    private String recipient;
    private String smtProvider;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtProvider = smtpProvider;
    }


    public void setSmtpProvider(String smtpProvider) {
        this.smtProvider = smtpProvider;
    }

    public void setStatus(String setStatus) {
        this.status = status;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    @Override
    public void transport() {
        System.out.println("the recipient: "+recipient+ "the smtProvider: "+smtProvider+" created on: "+getCreatedAt()+ "subject: "+getSubject()+"Contents: "+getBody());
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtProvider;
    }
}

