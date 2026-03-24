/*
    Product interface representing a phone. This is the common interface that all concrete products will implement.
        - It defines the method `calling()` that all concrete phone classes must implement.
        - The constructor is private to prevent direct instantiation of the abstract class.
        - This ensures that only concrete subclasses can be instantiated, adhering to the factory method pattern.
*/
package com.factory.factory_method;

public abstract class phone {
    // Constructor to prevent direct instantiation
    private phone(){
        throw new UnsupportedOperationException("Cannot instantiate abstract class");
    }

    // Abstract method to be implemented by subclasses
    public abstract void calling();
}
