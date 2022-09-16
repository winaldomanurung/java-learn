
public class Main {
	public static void main(String[] args) {
//	static keyword merupakan modifier.
//		A single copy of a variable/method is created and shared
//		The class 'owns' the static member
		
		Friend friend1 = new Friend("Spongebob");
		Friend friend2 = new Friend("Patrick");
		
//		numberoffriends bisa langsung dipanggil langsung dari Class tanpa instantiation karena dia sifatnya static variable
//		antara friend1 and friend2 akan share the same numberOfFriends
		System.out.println(Friend.numberOfFriends);
		
//		kita bisa akses dari instance juga tapi ga direkomendasikan
		System.out.println(friend1.numberOfFriends);
		
		Friend.displayFriends();
	}
}
