import java.util.Scanner;

public class IfElseBasic {
	public static void main(String args[]) {
		Scanner s;
		s = new Scanner(System.in);
		int a;
		System.out.println("Enter a: ");
		a=s.nextInt();
		if(a<0)
			System.out.println("Negative");
		else
			System.out.println("Positive");
	}
}
