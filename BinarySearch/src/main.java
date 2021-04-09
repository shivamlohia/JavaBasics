import java.util.Scanner;

public class main {
    static boolean binarySearch(int arr[], int element, int start, int end)
    {
        if(start > end)
            return false;
        int mid = start + (end - start) / 2;
        if(arr[mid] == element)
            return true;
        else if(arr[mid] > element)
            binarySearch(arr, element, start, mid - 1);
        else
            binarySearch(arr, element, mid + 1, end);
        return false;
    }
    public static void main(String[] args) {
        Scanner ipReader = new Scanner(System.in);
        int size = ipReader.nextInt();
        int arr[] = new int[size];
        for(int i = 0 ; i < size ; ++i)
            arr[i] = ipReader.nextInt();
        int element = ipReader.nextInt();
        boolean present = binarySearch(arr,element,0,size - 1);
        if(present)
            System.out.println(element + "Element is present.");
        else
            System.out.println("Element not found.");
    }
}
