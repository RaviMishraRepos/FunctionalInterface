import java.util.function.BiFunction;

public class G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiFunction<Integer, Integer, Integer> bifun = (num1, num2) -> {

			if (num1 > num2) {
				return num1;
			} else {
				return num2;
			}
		};

		System.out.println(bifun.apply(23, 90));

	}

}
