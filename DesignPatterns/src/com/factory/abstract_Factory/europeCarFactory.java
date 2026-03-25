package com.factory.abstract_Factory;

public class europeCarFactory implements carFactory {

    public car createCar() {
        return new SUV();
    }

    
    public carSpecification createSpecification() {
        return new europeCarSpecification();
    }

}
