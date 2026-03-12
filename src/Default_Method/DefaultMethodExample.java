package Default_Method;

/*
In Java 8, default methods allow you to add new functionality to interfaces without breaking
the classes that already implement them. A default method has a body inside the interface and
is marked with the default keyword.
*/


interface Vehicle {
    // Abstract method (must be implemented by classes)
    void drive();

    // Default method (has a body, optional to override)
    default void start() {
        System.out.println("Vehicle is starting...");
    }

    // Another default method
    default void stop() {
        System.out.println("Vehicle is stopping...");
    }

    // Static method in interface (Java 8 feature)
    static void info() {
        System.out.println("Vehicles are used for transportation.");
    }
}

class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Car is driving...");
    }

    // Optionally override default method
    @Override
    public void stop() {
        System.out.println("Car has stopped safely.");
    }
}

public class DefaultMethodExample {
    public static void main(String[] args) {
        Car car = new Car();

        car.drive();   // Abstract method
        car.start();   // Default method from interface
        car.stop();    // Overridden default method

        // Static method called directly from interface
        Vehicle.info();
    }
}
