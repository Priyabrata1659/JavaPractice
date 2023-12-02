package BasicJava;

public class StaticAndNonStatic {
	
	public static void test1() {
		System.out.println("Test One");
		//test2();  ----> Error
	}
	
	public void test2() {
		System.out.println("Test Two");
		test1();
		test3();
	}
	
	public void test3() {
		System.out.println("Test Three");
	}

	public static void main(String[] args) {
		
		StaticAndNonStatic sns = new StaticAndNonStatic();
		sns.test1();
		sns.test2();
		sns.test3();

	}

}
