package Functional_Interface;

import java.util.function.Function;

// (Input → Output)

public class FunctionExample {
    public static void main(String[] args) {

        Function<Integer, Integer> square = x -> x * x;

        System.out.println(square.apply(5));
    }
}
