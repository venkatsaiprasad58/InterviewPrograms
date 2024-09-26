package programs;

import java.util.Optional;

public class OptionalClassExample {

	public static void main(String[] args) {

		Optional<Integer> op = Optional.of(232);

		System.out.println(op);

		int hashCode = op.hashCode();
		System.out.println(hashCode);

		boolean empty = op.isEmpty();
		System.out.println(empty);

	}

}
