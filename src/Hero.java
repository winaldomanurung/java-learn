
public class Hero extends Person {
	String power;
	
	Hero(String name, int age, String power){
//		kalau this refer to this (Hero) class
//		kalau super refer to the super class (Person), disini kita panggil constructornya
		super(name, age);
		this.power = power;
	}
	
	public String toString() {
		return super.toString() + this.power;
	}
}
