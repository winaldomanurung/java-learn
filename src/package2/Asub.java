package package2;
import package1.*;

public class Asub extends A {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c = new C();
		System.out.println(c.defaultMessage);
		System.out.println(c.protectedMessageC);
		
		Asub asub = new Asub();
		System.out.println(asub.protectedMessageA);
		
//		Ini error
		B b = new B();
//		System.out.println(b.protectedMessageB);
	}

}
