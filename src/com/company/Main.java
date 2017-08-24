package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        EmailNotification email = new EmailNotification("Progress Report.", "A++++++", "Ochanya", "Google");
        TextNotification text = new TextNotification("Progress Report.", "A++++++", "Ochanya", "t-mobile");
        email.transport();
        text.transport();

    }

}
