package Lambda_Expression;

import java.util.*;

@FunctionalInterface
interface ArithmeticOperation {
    int operate(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using lambda for iteration
        names.forEach(name -> System.out.println(name));

        // Using lambda for sorting
        names.sort((a, b) -> a.compareTo(b));
        System.out.println("Sorted: " + names);

        // Arithmetic operations using lambdas
        ArithmeticOperation add = (a, b) -> a + b;
        ArithmeticOperation subtract = (a, b) -> a - b;
        ArithmeticOperation multiply = (a, b) -> a * b;
        ArithmeticOperation divide = (a, b) -> b != 0 ? a / b : 0; // avoid divide by zero & :0 is used to return 0 act as else pasrt
        ArithmeticOperation modulus = (a, b) -> b != 0 ? a % b : 0;

        int x = 10, y = 5;

        System.out.println("Addition: " + add.operate(x, y));
        System.out.println("Subtraction: " + subtract.operate(x, y));
        System.out.println("Multiplication: " + multiply.operate(x, y));
        System.out.println("Division: " + divide.operate(x, y));
        System.out.println("Modulus: " + modulus.operate(x, y));

        // Increment and Decrement using lambdas (single operand)
        java.util.function.IntUnaryOperator increment = a -> a + 1;
        java.util.function.IntUnaryOperator decrement = a -> a - 1;

        System.out.println("Increment of " + x + ": " + increment.applyAsInt(x));
        System.out.println("Decrement of " + y + ": " + decrement.applyAsInt(y));
    }
}
