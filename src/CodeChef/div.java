package CodeChef;

import java.util.Scanner;

public class div {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            // System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
            int lcm = a * b / gcd(a, b);
            System.out.println(lcm / a);
        }

    }

    static int gcd(int a, int b) {
        // Everything divides 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return gcd(a - b, b);
        return gcd(a, b - a);
    }

}
