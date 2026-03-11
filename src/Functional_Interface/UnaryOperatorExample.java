package Functional_Interface;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {

        UnaryOperator<Integer> cube = x -> x * x * x;

        System.out.println(cube.apply(3));
    }
}
