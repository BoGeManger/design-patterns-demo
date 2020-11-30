package com.berg.builder;

public class BikeDirector {
    public void createBike(BikeBuilder concreteBuilder){
        concreteBuilder.setFrame(1);
        concreteBuilder.setWheels(4);
    }
}
