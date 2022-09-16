
public class Main {
	public static void main(String[] args) {
//	overloaded constructors adalah multiple constructors within a class with the same name but have different parameters
//	name + parameters = signature
		Pizza pizza1 = new Pizza("thicc crust");
		Pizza pizza2 = new Pizza("thicc crust", "tomato");
		Pizza pizza3 = new Pizza("thicc crust", "tomato", "mozzarella");
		Pizza pizza4 = new Pizza("thicc crust", "tomato", "mozzarella", "pepperoni");
		
		System.out.println("Here are the ingredients of your pizza: ");
		System.out.println(pizza1.bread);
		System.out.println(pizza2.bread);
		System.out.println(pizza2.sauce);
		System.out.println(pizza3.bread);
		System.out.println(pizza3.sauce);
		System.out.println(pizza3.cheese);
		System.out.println(pizza4.bread);
		System.out.println(pizza4.sauce);
		System.out.println(pizza4.cheese);
		System.out.println(pizza4.topping);	
	}
}
