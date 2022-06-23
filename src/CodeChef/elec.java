package CodeChef;

import java.util.Scanner;

/**
 * elec
 */
public class elec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a > 50)
                System.out.println("A");
            if (b > 50)

                System.out.println("B");
            if (c > 50) {
                System.out.println("C");
            }
            if (a <= 50 && b <= 50 && c <= 50)
                System.out.println("NOTA");

        }
    }
}