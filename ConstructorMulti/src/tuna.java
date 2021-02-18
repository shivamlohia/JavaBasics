import java.util.Scanner;
public class tuna {
	public static void main(String[]args) {
		int h, s, m;
		apple a= new apple();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter hr minute and secs:");
		h= sc.nextInt();
		//a.setHr(h);
		m= sc.nextInt();
		//a.setMin(m);
		s= sc.nextInt();
		//a.setSec(s);
		a.setTime(h, m, s);
		System.out.println(a.getHr()+":"+a.getMin()+":"+a.getSec());
	}
}
