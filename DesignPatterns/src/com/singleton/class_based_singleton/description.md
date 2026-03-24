# 1. Class Based Singleton

This is the most popular approach

It have
- a private constructor
- a static field containing its only instance
- a static factory method for obtaining the instance

>Cons: It can be problematic in multithreading scenarios.

# Why we Use private Constructors

>The difference Between private and public constructors in java is mainly about who is allowed to create objects of a class.

**Public Constructor** - Can be accessed from anywhere

```java
class Car {
    public Car() {
        System.out.println("Car created");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car(); // ✅ allowed
    }
}

```

**Private Constructor** - Can only be accessed inside the same class.

```java
class Car {
    private Car() {
        System.out.println("Car created");
    }
}

public class Main {
    public static void main(String[] args) {
        // Car c = new Car(); ❌ NOT allowed
    }
}

```