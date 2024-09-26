package programs;

import java.util.Optional;

public class OptionalOfNullableExample {
	
	public static void main(String[] args) {
        Optional<Integer> optional1 = Optional.ofNullable(3);
        System.out.println("Optional1: " + optional1);

        Optional<String> optional2 = Optional.ofNullable(null);
        System.out.println("\n\nOptional2: " + optional2);
        System.out.println("Optional2.isPresent: " + optional1.isPresent());
    }

}
