package object_oriented_programming;

public class Human {
	
	String name;
	int age;
	double weigth;
	
	Human(String name, int age, double weigth){
		this.name = name;
		this.age = age;
		this.weigth = weigth;
	}
	
	void eat() {
		System.out.println(this.name + " is eating");
	}
	void drive() {
		System.out.println(this.name+" is driving");
	}

}
