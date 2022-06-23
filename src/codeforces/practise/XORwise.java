// package codeforces.practise;

import java.util.Scanner;

public class XORwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int min = 0;
            int sum = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            // for (int i = 0; i <= b; i++) {
            //     sum = (a ^ i) + (b ^ i);
            //     min = Math.min(min, sum);
            // }
            System.out.println(a^b);
        }
    }
}
