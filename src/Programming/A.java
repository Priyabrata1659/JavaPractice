package Programming;

public class A {
	
	public static void input(int num)
	{
		int p=0;
		int s=0;
		int t=num;
		
		while(num >0) {
			p=num%10;  //1,5,1
			s=(s*10)+p; //1,15
			num=num/10; //15,1
		}
		System.out.println(s);
		
		if(s==t) {
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not");
		}
	}

	public static void main(String[] args) {
		input(342);
	}

}
