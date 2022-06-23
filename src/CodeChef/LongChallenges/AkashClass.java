package CodeChef.LongChallenges;

import java.util.Scanner;

public class AkashClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();

            if (n < 6)
                System.out.println("0");
            else if (n == 6)
                System.out.println("1");
            else {
                long r = n % 7;
                if (r >= 6)
                    System.out.println((int) n / 7 + 1);
                else
                    System.out.println((int) n / 7);
            }
        }
    }
}
