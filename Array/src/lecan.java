import java.util.Scanner;

public class lecan {
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int []b= new int[t];
		int []ct= new int[t];
		for(int j=0;j<t;j++) {
			int i, f=0, n;
			n = sc.nextInt();
			ct[j]= sc.nextInt();
			int []a = new int[n];
			for(i=0;i<n;i++) {
				a[i] = sc.nextInt();
				f+=a[i];
			}
			b[j]=f;
		}
		for(int j=0;j<t;j++) {
			if(b[j]>ct[j])
				System.out.println("No");
			else
				System.out.println("Yes");
		}
	}
}
