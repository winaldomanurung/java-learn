package package1;
import package2.*;

public class A {
//	protected access modifiers
	protected String protectedMessageA = "This is protected";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c = new C();
//		System.out.println(c.defaultMessage);
		System.out.println(c.publicMessage);
		
		

	}

}
