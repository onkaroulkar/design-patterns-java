package org.prateek.CreationalPatterns.BuilderPattern.Solution;

public class House {
    private String foundation;
    private String structure;
    private String roof;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasGarden;

    //Constructor
    private House(HouseBuilder builder) {
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.roof = builder.roof;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
        this.hasGarden = builder.hasGarden;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasGarden=" + hasGarden +
                '}';
    }

    public static class HouseBuilder{
        private String foundation;
        private String structure;
        private String roof;
        private boolean hasGarage;
        private boolean hasSwimmingPool;
        private boolean hasGarden;

        //Builder Constructor with mandatory parameters
        public HouseBuilder(String foundation,String structure,String roof){
            this.foundation = foundation;
            this.structure = structure;
            this.roof = roof;
        }

        //Optional Parameters
        public HouseBuilder setGarden(boolean hasGarden){
            this.hasGarden = hasGarden;
            return this;
        }
        public HouseBuilder setSwimmingPool(boolean hasSwimmingPool){
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }
        public HouseBuilder setGarage(boolean hasGarage){
            this.hasGarage = hasGarage;
            return this;
        }
        public House build(){
            return new House(this);
        }
    }
}

==================================================================================================================================================================
The Builder Design Pattern in Java is a powerful and flexible way to construct complex objects. It is especially useful when an object has many optional 
parameters or when you want to make your code more readable and maintainable.
----------------------------------------------------------------------------------------------------------------------------------------------------------------------
What Is the Builder Pattern?
The Builder Pattern is a creational design pattern that lets you construct complex objects step by step. It allows you to create different types and 
representations of an object using the same construction code.
------------------------------------------------------------------------------------------------------------------------------------------------------------------
Structure of the Builder Pattern in Java
Here’s a breakdown of the components:

Product – The object that is being built.
Builder – An abstract class or interface that defines the building steps.
ConcreteBuilder – Implements the Builder interface and builds the product.
Director (optional) – Controls the building process.
Client – Uses the builder to construct the object.
------------------------------------------------------------------------------------------------------------------------------------------------------------------
