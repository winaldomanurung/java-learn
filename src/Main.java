
public class Main {
	public static void main(String[] args) {
//		interface is a template that can be applied to a class
//		it is similar to inheritance, but specifies what a class has/must do
//		classes can apply to more than one interface, inheritance is limited to 1 super class
		
		Rabbit rabbit = new Rabbit();
		rabbit.flee();
		
		Hawk hawk = new Hawk();
		hawk.hunt();
		
		Fish fish = new Fish();
		fish.hunt();
		fish.flee();
	}
}
