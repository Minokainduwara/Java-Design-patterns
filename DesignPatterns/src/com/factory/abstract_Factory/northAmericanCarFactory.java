package com.factory.abstract_Factory;

public class northAmericanCarFactory implements carFactory {
    
    public car createCar() {
        return new Sedan();
    }

    
    public carSpecification createSpecification() {
        return new northAmericanCarSpecification();
    }
    
}
