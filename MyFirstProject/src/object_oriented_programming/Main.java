package object_oriented_programming;

public class Main {

	public static void main(String[] args) {
		
		Human human1 = new Human("Caio", 35, 90);
		Human human2 = new Human("Rick", 19, 65);
		
//		System.out.println(human1.weigth);
		
		human2.eat();
		human1.drive();
		
	}

}
