
public class Main {
	public static void main(String[] args) {
		Car car1 = new Car("Chevrolet", "Camaro", 2021);
		Car car2 = new Car("Ford", "Mustang", 2022);
		
//		cara copy object bukan dengan:
//		car1 = car2 (ini akan menghasilkan object dengan address yang sama)
//		melainkan dengan:
		
		car2.copy(car1);
		
//		atau jika kita mau copy langsung tanpa instantiate car2
//		namun syaratnya kita harus buat overloaded constructor
		Car car1b = new Car("Chevrolet", "Camaro", 2021);
		Car car2b = new Car(car1b);
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		
		System.out.println();
		System.out.println(car1b);
		System.out.println(car2b);
		System.out.println();
		System.out.println(car1b.getMake());
		System.out.println(car1b.getModel());
		System.out.println(car1b.getYear());
		System.out.println();
		System.out.println(car2b.getMake());
		System.out.println(car2b.getModel());
		System.out.println(car2b.getYear());
	}
}
