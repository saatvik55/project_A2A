package codeforces;

import java.util.Scanner;

public class wrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long total = 0;
            int n = sc.nextInt();
            if (Math.pow(3, n - 1) > Math.pow(10, 9)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                for (int i = 0; i < n; i++) {
                    System.out.print((int)Math.pow(3, i) +" ");
                }
                System.out.println();
            }
        }
    }
}
