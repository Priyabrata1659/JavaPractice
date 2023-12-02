package Programming;

public class AutomorphicNumber {
	public static void AutomorphicNumber(int no) {
		int a=0;
		int b=10;
		int c=no*no;
		
		while(a<no) {
			a=c%b;
			b=b*10;
		}
		if(a==no)
		{
			System.out.println("The given number " + no + " is a AutomorphicNumber");
		}
		
		else {
			System.out.println("The given number " + no + " is not a AutomorphicNumber");
		}
	}

	public static void main(String[] args) {
		AutomorphicNumber(25);

	}

}
