package OOPConcept;

public class MethodOverRidding {

	/*When some methods are present in parent class as well as child class 
	with the same name and same number of arguments is called method overRidding. */ 
	
	public static void main(String[] args) {
		
		ChildBMW p = new ChildBMW();
		p.start();
		p.refule();
		p.theftSafety();
		p.stop();
		p.accident(9);

	}

}
