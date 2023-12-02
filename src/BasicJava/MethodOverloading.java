package BasicJava;

public class MethodOverloading {
	
	public void sum() { //0input param
		System.out.println("Sum method--zero param");
	}
	
	public void sum(int i) { //1 input param
		System.out.println("Sum method with one param is");
		System.out.println(i);
	}
	
	public void sum(int i, int k, String s) {
		System.out.println(i);
		System.out.println(k);
		System.out.println(s);
	}

	/*Method overloading--> Within the same class when we have methods with same name 
	                        but different arguments and parameters. */
	//We can not create a method inside a method
	//We can not create methods having same name and same number of arguments
	public static void main(String[] args) {


		MethodOverloading ml = new MethodOverloading();
		ml.sum();
		ml.sum(20);
		ml.sum(30, 10, "Vicky");
		ml.sum(21, 31, "Guddy");
		
		
	}

}
