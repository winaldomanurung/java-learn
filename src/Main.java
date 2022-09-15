import java.util.*;

public class Main {
	public static void main(String[] args) {
// 		2D ArrayList is a dynamic list of lists
//		We can change the size of these lists during runtime
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList<String>();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList<String>();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");
		
		ArrayList<String> drinksList = new ArrayList<String>();
		drinksList.add("soda");
		drinksList.add("coffee");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		System.out.println(groceryList);
		System.out.println(groceryList.get(0));
		System.out.println(groceryList.get(0).get(0));

	}
}
