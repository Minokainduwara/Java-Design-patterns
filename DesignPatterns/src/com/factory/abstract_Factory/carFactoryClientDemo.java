package com.factory.abstract_Factory;

public class carFactoryClientDemo {
    public static void main(String[] args) {
        carFactory northAmericanFactory = new northAmericanCarFactory();
        car northAmericaCar = northAmericanFactory.createCar();
        carSpecification northAmericaSpec = northAmericanFactory.createSpecification();

        northAmericaCar.assemble();
        northAmericaSpec.display();

        carFactory europeanFactory = new europeCarFactory();
        car europeCar = europeanFactory.createCar();
        carSpecification europeSpec = europeanFactory.createSpecification();

        europeCar.assemble();
        europeSpec.display();
    }
}
