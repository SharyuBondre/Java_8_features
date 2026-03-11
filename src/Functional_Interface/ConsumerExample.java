package Functional_Interface;

import java.util.function.Consumer;

//(Input → No Return)

public class ConsumerExample {
    public static void main(String[] args) {

        Consumer<String> print = name -> System.out.println(name);

        print.accept("Rahul");
    }
}