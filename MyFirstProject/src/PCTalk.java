import java.util.Scanner;

public class PCTalk {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual eh o seu nome, mizeravi??");
		String name = scanner.nextLine();
		System.out.println("E a tua idade? Num mente naum viu kkk");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("E a tua comida favorita eh o que msm?");
		String food = scanner.nextLine();
		
		System.out.println("Teu nome eh " + name + "? Ok, \"sr " + name + "\" kkk");
		System.out.println("E tu tem " + age + " anos jah? Caraio ta veio hein bixo");
		System.out.println(food + " eh bom mesmo viu");
		

	}

}
