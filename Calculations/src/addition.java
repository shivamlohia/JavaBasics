import java.util.Scanner;
public class addition {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner s;
		s = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter a: ");
		a=s.nextInt();
		System.out.println("Enter b: ");
		b=s.nextInt();
		c=a+b;
		System.out.println("a+b="+c);
	}
}
