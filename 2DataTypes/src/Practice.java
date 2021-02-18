import java.util.Scanner;

public class Practice {
    public static void main (String[] args) {
        Scanner ipReader = new Scanner(System.in);
        int test = ipReader.nextInt();
        while(test-- != 0)
        {
            int n = ipReader.nextInt();
            int m = ipReader.nextInt();
            int arr[][] = new int[n][m];
            for(int i = 0 ; i < n ; i++)
                for(int j = 0 ; j < m ; j++)
                    arr[i][j] = ipReader.nextInt();
            for(int i = 0 ; i<n ; i++)
                System.out.print(arr[0][i] + " ");
            for(int i = 1 ; i < m ; i++)
                System.out.print(arr[i][m-1] + " ");
            for(int i = n-2 ; i >= 0 ; i--)
                System.out.print(arr[n-1][i]+ " ");
            for(int i = m-2 ; i > 0 ; i--)
                System.out.print(arr[i][0] + " ");
            System.out.println();
        }
    }
}
