
public class Human {
	String name;
	int age;
	double weight;
	
//	Creating constructor => ini akan langsung dijalankan ketika class di instantiate
	Human(String name, int age, double weight){
//		this ini nantinya akan di replace dengan nama instance, dalam hal ini human
//		human.name = name; dst
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
//	untuk akses property di constructor juga kita butuh this keyword
	void eat() {
		System.out.println(this.name + " is eating.");
	}
	
	void drink() {
		System.out.println(this.name + " is drinking.");
	}
}
