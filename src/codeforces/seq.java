package codeforces;

import java.util.Scanner;

public class seq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int arr[] = new int[3];
            for (int j = 0; j < 3; j++) {
                arr[j] = sc.nextInt();
            }
            double sum = (arr[0] + arr[2]) / 2.0;
            // System.out.println(sum);
            if (sum == 0 && sum == arr[1] && arr[1] == 0) {
                System.out.println("YES");
            } else if (arr[1] % sum == 0 || sum % arr[1] == 0 || sum == arr[1]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

     
        }
    sc.close();
    }
}
