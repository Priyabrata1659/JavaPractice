package Programming;

public class PerfectNumber {

	//WAP to print the perfect number
	public static void main(String[] args) {
		
		int num=7;
		int per=0;
		
		for(int i=1; i<=num/2; i++)
		{
			per=per+i;
		}
		
		if(per==num)
			System.out.println(num+ " " + "is a perfectnumber");
		else
			System.out.println(num+ " " + "is not a perfectnumber");

		
	}

}
