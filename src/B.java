import java.util.function.Consumer;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer<String> consumer = (name) -> {
			System.out.println(name);
		};

		consumer.accept("Milan");

	}

}
