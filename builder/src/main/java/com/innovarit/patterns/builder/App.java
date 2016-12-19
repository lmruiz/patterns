package com.innovarit.patterns.builder;

/**
 * By luisruiz on 18/12/16.
 */
public class App {

    public static void main(String args[]){
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("info@company.com");
        emailMessage.setContent("informacion importante");
        emailMessage.setMimeType("HTML");
        emailMessage.setSubject("Important Info");
        emailMessage.setTo("customer@email.com");

        System.out.println(emailMessage);
    }

}
