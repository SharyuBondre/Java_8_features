package Optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // Creating Optional with a non-null value
        Optional<String> name = Optional.of("Sharyu");

        // Creating Optional that may be null
        Optional<String> emptyName = Optional.ofNullable(null);

        // Checking if value is present
        if (name.isPresent()) {
            System.out.println("Name: " + name.get());
        }

        // Using ifPresent (functional style)
        name.ifPresent(n -> System.out.println("Hello, " + n));

        // Providing default value if empty
        String defaultName = emptyName.orElse("Default User");
        System.out.println("Empty name replaced with: " + defaultName);

        // Throwing exception if value is missing
        try {
            String riskyName = emptyName.orElseThrow(() -> new IllegalArgumentException("Name not found!"));
            System.out.println(riskyName);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}