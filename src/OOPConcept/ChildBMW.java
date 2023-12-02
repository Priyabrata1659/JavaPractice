package OOPConcept;

public class ChildBMW extends ParentCar{

	public void start() //OverRidden Method
	{
		System.out.println("BMW----Start");
	}
	
	public void theftSafety() {
		System.out.println("BMW--- theftSafety");
	}
	
	public void accident(int t) {
		System.out.println("The number of accident happened is: "+ t);
	}
}
