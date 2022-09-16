
public class Dog extends Animal {
//	ini akan overriding the speak method in parent class Animal
//	kita bisa tambah @Override sebagai best practice
	@Override
	void speak() {
		System.out.println("The dog goes *bark*");
	}
}
