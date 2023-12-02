package BasicJava;

public class JavaVariable {
	int i = 123;
	int j = 1234; //Instance or Global Variable
	static int p = 100; //Static variable
	public void go() {
		int k = 90;
		System.out.println(k);
		
	}

	public void show() {
	    int l = 87; //Local variable
	    System.out.println(l);
	}
	
	public void news() {
	    int l = 90;
	}
	public static void main(String[] args) {
		JavaVariable jv = new JavaVariable();
		System.out.println(jv.i);
		System.out.println(JavaVariable.p);
		jv.go();
		jv.show();

	}

}
