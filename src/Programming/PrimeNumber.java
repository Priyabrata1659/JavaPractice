package Programming;

public class PrimeNumber {

	public static void main(String[] args) {

		int a = 7;
		int b = 0;

		if (a > 2) {

			for (int i = 2; i < a; i++) {
				if (a % i == 0) {

					b++;
				}
			}

			if (b > 0) {
				System.out.println(a + " " + "is not a prime number");
			}

			else {
				System.out.println(a + " " + "is a prime number");
			}

			System.out.println(a);
		}

		else {
			System.out.println("Please enter a value greater than 2");
		}

	}

}