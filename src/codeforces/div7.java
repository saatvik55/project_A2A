// package codeforces;

import java.util.Scanner;

public class div7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // int fayada=0;
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int rem = 0;
            rem = n % 7;
            int k = 0;
            if (rem == 0)
                System.out.println(n);
            else {
                k = n % 10;

                if (k - rem < 0)
                    System.out.println(n + 7 - rem);
                else if (k - rem >= 0)
                    System.out.println(n - rem);
            }
        }
    }
}
