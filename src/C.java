import java.util.function.Function;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Integer, String> fun = (num) -> {

			if (num % 2 == 0) {
				return "Even";
			} else {
				return "Odd";
			}
		};

		System.out.println(fun.apply(90));
		
	}

}
