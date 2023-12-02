package JavaExceptions;

public class Exceptions {

	public static void main(String[] args) {
		
		try {
		int divide = 10/0;
		System.out.println(divide); //ArithmeticException
		}
		catch(Exception e) {
			System.out.println("Error occured");
			System.out.println(e.getMessage()); //to print the exception 
		}
		
		try {
		int i[] = new int[4];
		i[5] = 30;
		}
		catch(Throwable t) {
			System.out.println("Error occured again");
		}
	}

}
