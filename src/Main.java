
public class Main {
	public static void main(String[] args) {
//		Overloaded Methods are methods that share the same name but have different parameters
//		method name + parameters = method signature
		int x= add (1,2);
		int y= add (1,2,3);
		int z= add (1,2,3,4);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	
	static int add(int a, int b) {
		System.out.println("This is overloaded method #1");
		return a+b;
	}
	static int add(int a, int b, int c) {
		System.out.println("This is overloaded method #2");
		return a+b+c;
	}
	static int add(int a, int b, int c, int d) {
		System.out.println("This is overloaded method #3");
		return a+b+c+d;
	}
}
