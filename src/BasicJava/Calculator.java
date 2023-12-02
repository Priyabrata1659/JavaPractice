package BasicJava;

public class Calculator {

	public int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public int sub(int a, int b) {
		int c1 = a - b;
		return c1;
	}

	public int mul(int a, int b) {
		int c2 = a * b;
		return c2;
	}

	public int div(int a, int b) {
		int c3 = a / b;
		return c3;
	}

	public static void main(String[] args) {
		Calculator ca = new Calculator();
		int sum = ca.add(20, 30);
		int sub = ca.sub(60, 40);
		int multi = ca.mul(20, 30);
		int div = ca.div(90, 10);

		System.out.println("The sum of the numbers is: " + sum);
		System.out.println("The subsctraction is: " + sub);
		System.out.println("The multiplication is: " + multi);
		System.out.println("The division is: " + div);
	}

}
