package Functional_Interface;

import java.util.function.Predicate;

// (Input → Boolean)

public class PredicateExample {
    public static void main(String[] args) {

        Predicate<Integer> checkEven = n -> n % 2 == 0;

        System.out.println(checkEven.test(10));
    }
}
