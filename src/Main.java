
public class Main {
	public static void main(String[] args) {
//		printf() = an optional method to control, format, and display text to the console window
//		two arguments = format string + (object/variable/value)
//		% [flags] [precision] [width] [conversion-character]
		
//		%d disebut sebagai format specifier
//		untuk hurufnya disebut [conversion character]
//		d untuk decimal number, termasuk integer
//		b untuk boolean
//		c untuk char
//		s untuk string
//		f untuk double
		System.out.printf("This is a format string %d", 123);
		
		boolean myBoolean = true;
		char myChar= '@';
		String myString = "Aldo";
		int myInt = 50;
		double myDouble = 1000;
		System.out.printf("%b", myBoolean);
		System.out.printf("%c", myChar);
		System.out.printf("%s", myString);
		System.out.printf("%d", myInt);
		System.out.printf("%f", myDouble);
		
//		[width] merupakan minimum number of characters to be written as output
//		ini akan membuat output minimal menjadi 10 huruf, kalo ga sampe akan ditambah dengan whitespace
		System.out.printf("%10s", myString);
		
//		[precision] merupakan sets number of digits of precision when outputting floating point values. Ini hanya untuk floats/double
		System.out.printf("%.2f", myDouble);
		System.out.println();
//		[flags] adds an effect to output based on the flag added to format specifier
//		- : left-justify
//		+ : output a plus (+) or minus (-) sign for a numeric value
//		0 : numeric values are zero-padded
//		, : comma grouping separator if numbers > 1000
		System.out.printf("%,f", myDouble);
	}
}
