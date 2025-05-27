package org.prateek.StructuralPatterns.AdapterPattern;

public class Client {
    public static void main(String[] args) {
        NotificationService emailService = new EmailNotificationService();
        emailService.send("customer@codingminutes.com","order confirmation","your order has been recieved!");

        //NotificationService sendGridEmailService = new SendGridService();
        NotificationService emailServiceUsingSendGrid = new SendGridAdapter(new SendGridService());
        emailServiceUsingSendGrid.send("customer@codingminutes.com","order confirmation","your order has been recieved!");
    }
}
===========================================================================================================================================================

What is the Adapter Pattern?
Imagine you have a new system that expects a certain interface, but you want to use an existing class that doesn’t match that interface. Instead of 
modifying the existing class, you create an adapter that translates the interface.
-----------------------------------------------------------------------------------------------------------------------------------------------------------
Java Example: Media Player Adapter
🎯 Goal:
We have a MediaPlayer interface that plays .mp3 files. But we also want to play .mp4 and .vlc files using an existing AdvancedMediaPlayer class.
-----------------------------------------------------------------------------------------------------------------------------------------------------------
 When to Use Adapter Pattern
When you want to use an existing class but its interface doesn’t match what you need.
When you want to create a reusable class that cooperates with unrelated or unforeseen classes.
-----------------------------------------------------------------------------------------------------------------------------------------------------------
