package org.prateek.CreationalPatterns.FactoryPattern.Solution;


public class TransportService {
    public static void main(String[] args) {
        //Direct create objects
        Transport vehicle = TransportFactory.createTransport("car");
        vehicle.deliver();
    }
}

===================================================================================================================================================================

The Factory Design Pattern is a creational design pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type
of objects that will be created. It promotes loose coupling by eliminating the need to bind application-specific classes into your code.
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

 Why Use the Factory Pattern?
To delegate the instantiation logic to a separate component.
To avoid tight coupling between the client and the concrete classes.
To manage and maintain object creation logic in one place.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------

 Structure of the Factory Pattern
Product – The interface or abstract class defining the object type.
ConcreteProduct – The actual implementation of the Product.
Creator (Factory) – Declares the factory method.
ConcreteCreator – Implements the factory method to return an instance of a ConcreteProduct.

------------------------------------------------------------------------------------------------------------------------------------------------------------------
✅ Advantages
Encapsulation: Object creation logic is centralized. -Loose Coupling**: Client code depends on interfaces, not concrete classes.
Scalability: Easy to introduce new types without changing client code.
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

❌ Disadvantages
Can lead to a large number of classes.
Complexity increases with more product types.

------------------------------------------------------------------------------------------------------------------------------------------------------------------
📦 Real-World Examples
Java’s Calendar.getInstance()
Spring Framework’s ApplicationContext.getBean()
JDBC’s DriverManager.getConnection()
