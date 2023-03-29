
public class OverloadedMethods {

	public static void main(String[] args) {
		
		
		int method = add(1, 2, 3);
		System.out.println(method);
	}
	
	static int add(int a, int b) {
		System.out.println("Overloaded method #1");
		return a + b;
	}
	static int add(int a, int b, int c) {
		System.out.println("Overloaded method #2");
		return a + b;
	}
	static int add(int a, int b, int c, int d) {
		System.out.println("Overloaded method #3");
		return a + b;
	}

}
