package com.factory.abstract_Factory;

public class europeCarSpecification implements carSpecification {
    @Override
    public void display() {
        System.out.println("European Car Specifications: \n- Engine: 2.0L Turbocharged\n- Transmission: 8-speed Automatic\n- Drivetrain: All-Wheel Drive\n- Safety: Advanced Driver Assistance Systems\n- Interior: Premium Leather Seats");
    }
    
}
