import java.util.function.Predicate;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> predicate = (num) -> {
			if (num % 2 == 0) {
				return true;
			} else {

				return false;
			}
		};

		System.out.println(predicate.test(91));

	}

}
