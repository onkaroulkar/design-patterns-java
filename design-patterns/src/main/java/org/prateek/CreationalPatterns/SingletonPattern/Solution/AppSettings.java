package org.prateek.CreationalPatterns.SingletonPattern.Solution;

public class AppSettings {
    // Step 1: Private static instance of the class
    private static AppSettings instance;

    private String databaseUrl;
    private String apiKey;

    //Step 2 : Private constructor to prevent direct object creation
    private AppSettings(){
        //Read settings from a config file
        databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        apiKey = "12345-ABCDE";
    }

    //Step 3: Public static method to get the single instance
    public static AppSettings getInstance(){
        if(instance==null){
            instance = new AppSettings();
        }
        return instance;
    }

    public String getDatabaseUrl(){
        return databaseUrl;
    }
    public String getApiKey(){
        return apiKey;
    }
}
===================================================================================================================================================================
🧠 Why Use Singleton?
To control access to shared resources (e.g., database connections, configuration settings).
To ensure consistency across the application by using a single instance.
To reduce memory footprint by avoiding multiple instantiations.
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
Structure of Singleton Pattern
Private Constructor – Prevents instantiation from outside the class.
Private Static Instance – Holds the single instance of the class.
Public Static Method – Provides global access to the instance.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
✅ Advantages
Controlled access to the sole instance.
Reduced memory usage.
Useful for shared resources.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
📦 Real-World Examples
Logger classes
Configuration managers
Thread pools
Database connection pools
------------------------------------------------------------------------------------------------------------------------------------------------------------------

