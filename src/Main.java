public class Main {
	public static void main(String[] args) {
//		autoboxing = mengubah primitive class ke wrapper class
//		unboxing = mengubah wrapper class ke primitive class
		Boolean a = true;
		Character b = '@';
		Integer c = 123;
		Double d = 3.14;
		String e = "Bro";		
		
//		ketika kita melakukan pengecekan, terjadi proses unboxing, sehingga kita mengecek primitive data type nya
		if(a==true) {
			System.out.println("This is true!");
		}
	}
}
