package CodeChef.cookoff;

import java.util.Scanner;

public class div {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int j = 1;
            int k = 1;
            for (int i = 0; i < n; i++) {
                arr[i] = k;
                System.out.print(arr[i] + " ");
                k = k * 2;
                if (i == n - 1)
                    {System.out.println();
                        break;}

                arr[++i] = k;
                System.out.print(arr[i] + " ");
                k = (j * 2) + 1;
                j++;
                    
                if(i==n -1)
                System.out.println();
                        
            }
        }
    }
}
