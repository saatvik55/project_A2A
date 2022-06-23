package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            // Arrays.sort(arr);

            for (int j = 0; j < n; j++) {
                while (arr[j] > n) {
                    arr[j] /= 2;
                    // System.out.println(arr[j]);
                }
                
            }
           // System.out.println(Arrays.toString(arr));
            int flag = 0;
            int count=0;
             for (int j = 0; j < n; j++) {
                for (int j2 = j + 1; j2 < n; j2++) {
                    if (arr[j] == arr[j2] && arr[j] != 1 && arr[j2] != 1) {
                        arr[j2] /= 2;
                    }
                    Arrays.sort(arr);
                    System.out.println(Arrays.toString(arr));
                    j--;
                    // break;
                }
            }
             System.out.println(Arrays.toString(arr));

            nested: for (int j = 0; j < n; j++) {
                for (int j2 = j + 1; j2 < n; j2++) {
                    if (arr[j] == arr[j2]) {
                        System.out.println("NO");
                        flag++;
                        break nested;
                    }
                }
            }
            if (flag == 0) {
                System.out.println("YES");
            }
        }
    }
}
