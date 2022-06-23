package CodeChef.starters;

import java.util.Arrays;
import java.util.Scanner;

public class bombbase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int count = 0;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
           
            for (int i = n-1; i >=0; i--) {
                if (x > arr[i])
                {System.out.println(arr[i]);
                    count=i+1;
                break;}
            }
            System.out.println(count);
        }
    }
}
