import java.util.Scanner;

public class cnote {
	public static void main(String []args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int []x = new int[t];
		int []y = new int[t];
		int []k = new int[t];
		int []n = new int[t];
		int []f = new int[t];
		for(int i=0;i<t;i++) {
			x[i] = s.nextInt();
			y[i] = s.nextInt();
			k[i] = s.nextInt();
			n[i] = s.nextInt();
			int p[]= new int[n[i]];
			int c[]= new int[n[i]];
			for(int j=0;j<n[i];j++) {
				p[j] = s.nextInt();
				c[j] = s.nextInt();
			}
			for(int j=0;j<n[i];j++) {
				if(p[j]>=(x[i]-y[i]) && c[j]<=k[i]) {
					f[i]++;
					break;
				}else {}
			}
		}
		for(int i=0;i<t;i++) {
			if(f[i]>0)
				System.out.println("LuckyChef");
			else
				System.out.println("UnluckyChef");
			}
	}
}
