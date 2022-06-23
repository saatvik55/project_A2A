package codeforces;

import java.util.Scanner;

public class playoff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            System.out.println((int) Math.pow(2, x) - 1);
        }
    }
}
