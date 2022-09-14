public class Main {
	public static void main(String[] args) {
//		Array must store the same data type
		String[] cars = {"Camaro", "Corvet", "Tesla"};
		
		cars [0] = "Mustang";
		
		System.out.println(cars[0]);
		
//		Alternative way to create an Array
		String[] cars2 = new String[3];
		cars2[0] = "Camaro";
		cars2[1] = "Corvette";
		cars2[2] = "Tesla";
		
//		for loop for an Array
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
	}
}
