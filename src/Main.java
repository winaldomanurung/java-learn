
public class Main {
	public static void main(String[] args) {
//		abstract keyword is for abstract classes and methods
//		abstract classes cannot be instantiated, but they can have a subclass that can be instantiated 
//		abstract methods are declared without an implementation, but the child class must implement them
		
//		dengan keyword abstract pada Vehicle kita tidak bisa menginstantiatenya
//		Vehicle vehicle = new Vehicle();
//		ini akan error, dimaksudkan agar kita tidak membuat sesuatu yang vague dan terlalu general. Iya vehicle, tapi what kind of vehicle?

		Car car = new Car();
		car.go();
	}
}
