package Method_Reference;

import java.util.Arrays;
import java.util.List;

/*

 A method reference in Java is a shorthand notation of a lambda expression that simply calls
 an existing method. Instead of writing a lambda like (args) -> someMethod(args), you can
 directly reference the method using ClassName::methodName.

 */




public class MethodReferenceDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sharyu", "Amit", "Neha", "Ravi");

        // Using lambda expression
        names.forEach(name -> System.out.println(name));

        // Using method reference (cleaner)
        names.forEach(System.out::println);

        // Static method reference
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        numbers.forEach(MethodReferenceDemo::printNumber);

        // Constructor reference
        List<String> people = Arrays.asList("Alice", "Bob");
        people.stream()
                .map(Person::new)   // Calls constructor Person(String name)
                .forEach(p -> System.out.println(p.getName()));
    }

    public static void printNumber(int number) {
        System.out.println("Number: " + number);
    }
}

class Person {
    private String name;
    public Person(String name) { this.name = name; }
    public String getName() { return name; }
}