import java.util.Scanner;

public class substring {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		int i, j, t, l;
		t=s.nextInt();
		String []sr = new String[t];
		int []c = new int[t];
		for(l=0;l<t;l++) {
			sr[l] = s.nextLine();
			c[l]=0;
			for(i=0;i<sr[l].length();i++)
				if(sr[l].charAt(i)=='1')
					for(j=i;j<sr[l].length();j++)
						if(sr[l].charAt(j)=='1')
							c[l]++;
		}
		for(l=0;l<t;l++)
			System.out.println(c[l]);
	}
}
