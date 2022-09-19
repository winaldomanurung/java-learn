import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		dynamic polymorphism
//		dynamic mean change after the compilation process (during runtime)
//		ex: A corvette is a: corvette, car, vehicle, object
	
//		Misal kita mau buat animal, yang bisa saja Dog atau Cat
//		Kita bisa tanyakan ke user during runtime
		Scanner scanner = new Scanner(System.in);
		Animal animal = new Dog();
		
		System.out.println("What animal do you want?");
		System.out.println("(1 = dog) or (2 = cat): ");
		int choice = scanner.nextInt();
		
		if(choice == 1) {
			animal = new Dog();
			animal.speak();
		} else if(choice == 2) {
			animal = new Cat();
			animal.speak();
		} else {
			animal = new Animal();
			System.out.println("That choice is invalid.");
			animal.speak();
		}
	}
}
