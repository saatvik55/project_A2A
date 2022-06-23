package CodeChef.lunchtime;

import java.util.Scanner;

public class str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x % 2 == 0 && y % 2 == 0) {
                int x1 = x / 2;
                int y1 = y / 2;
                while (x1-- > 0)
                    System.out.print("a");
                while (y1-- > 0)
                    System.out.print("b");
                x1 = x / 2;
                y1 = y / 2;
                while (y1-- > 0)
                    System.out.print("b");
                while (x1-- > 0)
                    System.out.print("a");

                System.out.println();

                x1 = x / 2;
                y1 = y / 2;
                while (y1-- > 0)
                    System.out.print("b");
                while (x1-- > 0)
                    System.out.print("a");
                x1 = x / 2;
                y1 = y / 2;
                while (x1-- > 0)
                    System.out.print("a");
                while (y1-- > 0)
                    System.out.print("b");

            } else if (x % 2 != 0 && y % 2 != 0)
                System.out.println(-1);
        }
    }
}
