
public class Fish implements Prey, Predator{
//	kita harus define method yang ada di Prey
	@Override
	public void flee() {
		System.out.println("This fish is fleeing from a larger fish");
	}
	
//	kita harus define method yang ada di Predator
	@Override
	public void hunt() {
		System.out.println("This fish is hunting smaller fish");
	}
}
