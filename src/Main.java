
public class Main {
	public static void main(String[] args) {
		String name = "Aldo";
		int age = 21;
		int x = 3;
		int y = 4;
		hello();
		helloName(name);
		helloNameAge(name, age);
		int z = add(x,y);
		System.out.println(z);
	}
//		method is a block of code that is executed whenever it is called upon
	
	static void hello() {
		System.out.println("Hello");		
	}
	
	static void helloName(String name) {
		System.out.println("Hello "+ name);		
	}

	static void helloNameAge(String name, int age) {
		System.out.println("Hello "+ name +". You are "+ age + " years old");	
	}
	
	static int add(int x, int y) {
		int z = x + y;
		return z;
	}
}
