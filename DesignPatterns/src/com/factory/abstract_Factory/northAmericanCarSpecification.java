package com.factory.abstract_Factory;

public class northAmericanCarSpecification implements carSpecification {
    @Override
    public void display() {
        System.out.println("North American Car Specification: 4 doors, V6 engine, automatic transmission.");
    }
    
}
