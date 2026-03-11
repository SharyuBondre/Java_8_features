package Functional_Interface;

import java.util.function.Supplier;

// (No Input → Output)

public class SupplierExample {
    public static void main(String[] args) {

        Supplier<Integer> number = () -> 100;

        System.out.println(number.get());
    }
}