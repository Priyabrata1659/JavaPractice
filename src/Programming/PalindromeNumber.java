package Programming;

public class PalindromeNumber {

	public static void main(String[] args) {

		int no = 242;
		int temp = no;
		int rev = 0, remp;

		while (temp != 0) {

			remp = temp % 10;
			rev = rev * 10 + remp;
			temp = temp / 10;
		}
		if (no == rev) {
			System.out.println(no + " is palindrom number");
		} else {
			System.out.println(no + " is not a palindrom number");
		}

	}

}
