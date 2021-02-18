import java.util.Scanner;
public class fib_star {
	public static void main(String []args) {
		int n, i, j;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int []a = new int[n];
		a[0] = 1;
		a[1] = 1;
		for(i=2;i<n;i++)
			a[i] = a[i-1] + a[i-2];
		for(i=0;i<n;i++) {
			for(j=0;j<a[n-1]-a[i];j++)
				System.out.print(" ");
			for(j=0;j<a[i];j++)
				System.out.print("* ");
			System.out.println();
		}
	}
}
