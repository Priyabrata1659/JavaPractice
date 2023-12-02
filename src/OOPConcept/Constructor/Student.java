package OOPConcept.Constructor;

public class Student {
	String stName;
	int rlNum;
	
	/*
	 * public Student() { System.out.println("Calling constructor"); }
	 */
	
	public Student(String studentName, int rollNum) {
		this.stName = studentName;
		this.rlNum = rollNum;
	}

	public static void main(String[] args) {
		
		Student st = new Student("Rahul", 101);
		System.out.println(st);

	}

}
