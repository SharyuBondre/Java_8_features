package Static_Method;

/*
In Java 8, static methods in interfaces were introduced alongside default methods.
A static method belongs to the interface itself, not to the instances of classes that
implement it. You call it directly using the interface name.
*/


interface Calculator {
    // Abstract method
    int add(int a, int b);

    // Static method in interface
    static int multiply(int a, int b) {
        return a * b;
    }

    // Another static method
    static void info() {
        System.out.println("Calculator interface provides arithmetic operations.");
    }
}

class SimpleCalculator implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}

public class StaticMethodExample {
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();

        // Using abstract method
        System.out.println("Addition: " + calc.add(10, 5));

        // Calling static methods directly from the interface
        System.out.println("Multiplication: " + Calculator.multiply(10, 5));
        Calculator.info();
    }
}