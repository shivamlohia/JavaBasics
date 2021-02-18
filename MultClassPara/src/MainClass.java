import java.util.Scanner;
public class MainClass {
	public static void main(String args[]) {
		SubClass c = new SubClass();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String name = s.nextLine();
		c.setData(name);
		c.nameCall();
	}
}
