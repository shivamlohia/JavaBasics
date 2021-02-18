import java.util.Scanner;

public class SwitchCase {
	public static void main(String args[]) {
		Scanner s;
		s = new Scanner(System.in);
		int a, b, c, ch;
		System.out.println("Enter a: ");
		a=s.nextInt();
		System.out.println("Enter b: ");
		b=s.nextInt();
		System.out.println("1. Add\n2. Sub\n3. mult\n4. Quot\n5. Rem\nEnter a choice:");
		ch=s.nextInt();
		switch(ch) {
			case 1: c=a+b;
			System.out.println("Answer is "+c);
				break;
			case 2: c=a-b;
			System.out.println("Answer is "+c);
				break;
			case 3: c=a*b;
			System.out.println("Answer is "+c);
				break;
			case 4: c=a/b;
			System.out.println("Answer is "+c);
				break;
			case 5: c=a%b;
			System.out.println("Answer is "+c);
				break;
			default: System.out.println("Wrong Choice!");
				break;
		}
	}
}