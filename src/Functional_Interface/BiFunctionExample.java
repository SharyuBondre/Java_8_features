package Functional_Interface;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {


        //       1st input, 2nd input, 3Return type
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        System.out.println(add.apply(5, 3));
    }
}