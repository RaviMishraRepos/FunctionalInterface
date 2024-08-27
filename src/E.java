import java.util.function.BiPredicate;

public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiPredicate<Integer, Integer> bip = (num1, num2) -> {
			if (num1 > num2) {
				return true;
			} else {
				return false;
			}
		};

		System.out.println(bip.test(23, 34));

	}

}
