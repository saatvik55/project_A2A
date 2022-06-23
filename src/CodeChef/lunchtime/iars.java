package CodeChef.lunchtime;

import java.util.HashMap;
import java.util.Scanner;

public class iars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long[] arr = new long[(int) n];
            int count = 0;
            // HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();

            }

            int k = 1;
            for (int i = 0; i < n; i++) {
                if (arr[i] == 1)
                    count++;
            }
            if (count == 0)
                System.out.println("0");
            else {

                System.out.println(nCr(count, 2) + (n - count));

            }

        }
    }

    static int nCr(int n, int r) {
        return fact(n) / (fact(r) *
                fact(n - r));
    }

    // Returns factorial of n
    static int fact(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }

}