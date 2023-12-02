package JavaExceptions;

public class Finally_block {

	public static void main(String[] args) {
		
		try {
			//DB Connection -  successfully
			//executing some queries
			//validating the data and comparing from websites
			//closing connection
			int divide = 10/0;
			System.out.println(divide);
		}
		catch(Exception e) {
			System.out.println("Error occured");
		}
		finally {
			System.out.println("Closing the DB connection in finally block"); //finally block always get executed
		}

	}

}
