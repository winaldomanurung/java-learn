import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
//		For-Each => traversing technique to iterate through the elements in an array/collection
//		+ Using less steps and more readable
//		- Less flexible
		String[]animals = {"cat", "dog", "rat", "bird"};
		ArrayList<String> animals2 = new ArrayList<String>();
		
		animals2.add("cat");
		animals2.add("dog");
		animals2.add("rat");
		animals2.add("bird");
		
		for(String i : animals) {
			System.out.println(i);
		}
		
		for(String i : animals2) {
			System.out.println(i);
		}
	}
}
