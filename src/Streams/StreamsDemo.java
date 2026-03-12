package Streams;

import java.util.*;
import java.util.stream.*;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 1. filter() – keep only even numbers
        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evens);

        // 2. map() – square each number
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Squares: " + squares);

        // 3. sorted() – sort in reverse order
        List<Integer> sortedDesc = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Sorted descending: " + sortedDesc);

        // 4. distinct() – remove duplicates
        List<Integer> distinct = Arrays.asList(1,2,2,3,3,4,5).stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct: " + distinct);

        // 5. limit() – take first 5
        List<Integer> limited = numbers.stream()
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("First 5: " + limited);

        // 6. skip() – skip first 5
        List<Integer> skipped = numbers.stream()
                .skip(5)
                .collect(Collectors.toList());
        System.out.println("After skipping 5: " + skipped);

        // 7. forEach() – print each element
        System.out.print("All numbers: ");
        numbers.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();

        // 8. reduce() – sum of all numbers
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);

        // 9. collect() with Collectors.joining()
        String joined = Arrays.asList("A", "B", "C").stream()
                .collect(Collectors.joining(", "));
        System.out.println("Joined string: " + joined);

        // 10. anyMatch(), allMatch(), noneMatch()
        boolean anyEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        boolean allPositive = numbers.stream().allMatch(n -> n > 0);
        boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);
        System.out.println("Any even? " + anyEven);
        System.out.println("All positive? " + allPositive);
        System.out.println("None negative? " + noneNegative);

        // 11. findFirst() and findAny()
        Optional<Integer> first = numbers.stream().findFirst();
        Optional<Integer> any = numbers.stream().findAny();
        System.out.println("First element: " + first.orElse(null));
        System.out.println("Any element: " + any.orElse(null));

        // 12. count()
        long count = numbers.stream().count();
        System.out.println("Count: " + count);

        // 13. groupingBy()
        Map<String, List<Integer>> group = numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd"));
        System.out.println("Grouped: " + group);

        // 14. partitioningBy()
        Map<Boolean, List<Integer>> partition = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n > 5));
        System.out.println("Partitioned (>5): " + partition);

        // 15. parallelStream()
        int parallelSum = numbers.parallelStream()
                .reduce(0, Integer::sum);
        System.out.println("Parallel sum: " + parallelSum);
    }
}