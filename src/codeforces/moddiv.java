package codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class moddiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = sc.nextLong();
            long max=0;
            long sum=0;

            for (long i=x;i<=y;i++) {
                sum=(long)Math.floor(i/z)+ i%z;
                max=Math.max(max,sum);
            }
            System.out.println(max);
            
            // System.out.println(Math.floor(2/3)+2%3);
        }
    }
}
