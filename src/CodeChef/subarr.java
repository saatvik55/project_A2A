package CodeChef;

import java.util.Scanner;

public class subarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // int fayada=0;
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            int jj = 0;
            int nn=n;
            if (x <= n && x != 1) {
                for (int j = 1; j <= n / 2; j++) {
                    arr[j - 1] = j;
                    jj = j ;
                }
                for (int k = jj; k <n ; k++) {
                    arr[k] = nn;
                    nn--;
                }
                // int[] subarr=new int[n/2+1]
                for (int b = 0; b < arr.length; b++) {
                    System.out.print(arr[b] + " ");
                }
            } else if (x == 1 && n == 1) {
                System.out.print(1);
            } else if(n%2==0 && n-2>x) {
                System.out.println(-1);
            }
            System.out.println();
        }

    }
}
