import java.util.Random;

public class DiceRoller {
	
	Random random2 = new Random();
	int number2 = 0;
	
//	Constructor dianggap sebagai method
//	Setiap variable di dalam method hanya bisa diakses di dalam method itu saja (local variable)
//	Untuk itu supaya bisa akses oleh function roll, kita jadikan random dan number sebagai parameter
	DiceRoller(){
		Random random = new Random();
		int number = 0;
		roll(random, number);
		roll2();
	}
	

//	1. solusi 1, masukkan local variable sebagai parameter
	void roll(Random random, int number) {
		number = random.nextInt(6)+1;
		System.out.println(number);
	}
	
//	2. solusi 2, gunakan global variable
	void roll2() {
		number2 = random2.nextInt(6)+1;
		System.out.println(number2);
	}
}
