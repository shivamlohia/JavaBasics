import java.util.Scanner;

public class subSum {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int k, n, s, ss, i, j, t;
		t = sc.nextInt();
		
		int []fs = new int[t];
		int []fe = new int[t];
		int []f = new int[t];
		for(k=0;k<t;k++) {
			n = sc.nextInt();
			s = sc.nextInt();
			int []a = new int[n];
			for(i=0;i<n;i++)
				a[i] = sc.nextInt();
			outerloop: 
			for(i=0;i<n;i++) {
				ss=0;
				for(j=i;j<n;j++) { 
					if(ss==s) {
						fs[k]=i+1;
						f[k]=1;
						fe[k]=j;
						break outerloop;
					}
					else if(ss<s)
						ss+=a[j];
					fs[k]=-1;
					fe[k]=-1;
				}
			}
		}
		for(k=0;k<t;k++) {
			if(f[k]==1)
				System.out.println(fs[k]+" "+fe[k]);
			else
				System.out.println("-1");
		}
	}
}
