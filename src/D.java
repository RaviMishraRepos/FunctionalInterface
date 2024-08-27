import java.util.function.Supplier;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<Double> supplier = () -> {
			return Math.PI;
		};

		System.out.println(supplier.get());

	}

}
