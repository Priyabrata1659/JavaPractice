package Programming;

public class PrimeNumbers {

	public static void main(String[] args) {

		int num = 23;
		int pr = 0;

		if (num > 2) {

			for (int i = 2; i <= num; i++) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						pr++;
					}
				}
				if (pr == 0) {
					System.out.println(i);
				} else {
					pr = 0;
				}
			}
		}

		else {
			System.out.println("Please enter a number greater than 2");
		}

	}

}
