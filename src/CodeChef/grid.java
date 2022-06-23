package CodeChef;

import java.util.Scanner;

public class grid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        if (d % 2 == 0) {
            System.out.println(0 + " " + d / 2);
            System.out.println(0 + " " + (d / -2));
            System.out.println(d / 2 + " " + 0);
            System.out.println((-d / 2) + " " + 0);
        } else
            System.out.println(-1);
    }
}
