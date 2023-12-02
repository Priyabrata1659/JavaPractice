package OOPConcept;

public class ParentCar {

	public void start() {
		System.out.println("Car---- Start");
	}
	
	public void stop() {
		System.out.println("Car---- Stop");
	}
	
	public void refule() {
		System.out.println("Car---- refule");
	}
	
	public void accident(int t) {
		System.out.println("The number of accident happend is: " + t);
	}
}
