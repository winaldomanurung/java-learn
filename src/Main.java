
public class Main {
	public static void main(String[] args) {
//		polymorphism is the ability of an object to identifying more than one type
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
//		Misal kita mau buat array berisi car, bicycle, boat. Apa type yang harus kita define?
//		racers = {car, bicycle, boat};
//		karena mereka sama2 turunan dari Vehicle maka kita bisa buat:
		Vehicle[] racers = {car, bicycle, boat};
		
//		car.go();
//		bicycle.go();
//		boat.go();
//		kita bisa ganti dengan:
		for(Vehicle x : racers) {
			x.go();
		}
	
	}
}
