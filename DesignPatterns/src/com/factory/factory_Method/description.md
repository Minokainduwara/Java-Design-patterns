# 1. Factory method 

The Factory Method is a creational design pattern that defines an interface for creating objects but lets subclasses decide which object to instantiate. It promotes loose coupling by delegating object creation to a method, making the system more flexible and extensible.

- Subclasses override the factory method to produce specific object types.

- Supports easy addition of new product types without modifying existing code.

- Enhances maintainability and adaptability at runtime.

**Main components of Factory Design Pattern**

- **Product** - Abstract interface or class for objects created by the factory.

- **Concrete Product** - The actual object that implements the product interface.

- **Creator** - Declares the factory method

- **Concrete Creator** - Implements the factory method to create specific products