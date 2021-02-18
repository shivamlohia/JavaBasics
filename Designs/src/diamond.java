import java.util.Scanner;
public class diamond {
	public static void main(String []args) {
		int n, i, j;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++) {
			if(i==0||i==n) {
				for(i=0;i<n;i++)
					System.out.print("*");
				System.out.println();
			}
			else if(i<=n/2+1 && i>0) {
				for(i=0;i<n/2-i+1;i++)
					System.out.print("*");
				for(i=0;i<2*i+1;i++)
					System.out.print(" ");
				for(i=n/2-i+1;i>0;i--)
					System.out.print("*");
				System.out.println();
			}
			else {
				//for(i=0;i<)
			}
		}
	}
}
