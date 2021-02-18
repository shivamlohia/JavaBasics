import java.util.Scanner;
public class cont {
	public static void main(String args[]) {
		int l=0, f=0, n, i, j, c;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		c = s.nextInt();
		for(i=0;i<n;i++)
			for(j=i;j<n;j++)
				l++;
		int []a = new int[l];
		for(i=1;i<=l;i++)
			a[i-1] = i*c;
		for(i=0;i<n;i++) {
			for(j=0;j<i;j++)
				System.out.print(" ");
			for(j=i;j<n;j++) {
				System.out.print(a[f]+ " ");
				f++;
			}
			System.out.println();
		}
			
	}
}
