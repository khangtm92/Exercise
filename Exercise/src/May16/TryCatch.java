package May16;

public class TryCatch {
	public static void main(String[] args) {

		System.out.println("Three");
		int value = 10 / 2;
		System.out.println("Two");
		value = 10 / 1;
		System.out.println("One");
		try {
			value = 10 / 0;
			System.out.println("Value =" + value);
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
			System.out.println("Ignore...");
		}
		System.out.println("Let's go!");

	}
}
