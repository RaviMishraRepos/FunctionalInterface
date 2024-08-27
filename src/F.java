import java.util.function.BiConsumer;

public class F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiConsumer<Integer, Integer> bic = (num1, num2) -> {
			if (num1 > num2) {
				System.out.println("num1 is greater than num2");
			} else {
				System.out.println("NUm2 is greater than num1");
			}
		};

		bic.accept(12, 23);

	}

}
