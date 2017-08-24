package com.company;

import java.time.LocalDateTime;

public class Notification {

    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status;


    public Notification(LocalDateTime createdAt, String subject, String body) {
        this.createdAt = LocalDateTime.now();
        this.subject = subject;
        this.body = body;
        status= "false";
    }

    protected String printOut(){
        System.out.print("print something");
    }

    public String showStatus() {
        System.out.println(" the status is: "+status);
    }

    public void transport(){
        throw new NoTransportException();

    }
    public LocalDateTime getCreatedAt() {
        return this.createdAt;

    }

    public String getSubject() {
        return this.subject;

    }

    public String getBody() {
        return this.body;

    }
}
