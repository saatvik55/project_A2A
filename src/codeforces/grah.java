// package codeforces;

import java.util.Scanner;

public class grah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double m1 = 0, m2 = 0, m3 = 0;
        double x1 = 0, y1 = 0, x2 = 0, y2 = 0, x3 = 0, y3 = 0;
        for (int i = 0; i < n; i++) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            x3 = sc.nextInt();
            y3 = sc.nextInt();

            if (x2 - x1 != 0)
                m1 = (y2 - y1) / (x2 - x1);
            if (x3 - x2 != 0)
                m2 = (y3 - y2) / (x3 - x2);
            if (x3 - x1 != 0)
                m3 = (y3 - y1) / (x3 - x1);

            // System.out.println(m1+" "+m2+" "+m3);

            if (m1 == 0 && x2 - x1 != 0) {
                if (y3 < y2 && y3 < y1)
                    System.out.println(x2 - x1);
                else
                    System.out.println(0);
            } else if (m2 == 0 && x3 - x2 != 0) {
                if (y1 < y2 && y1 < y3)
                    System.out.println(x3 - x2);
                else
                    System.out.println(0);
            }

            else if (m3 == 0 && x3 - x1 != 0) {
                if (y2 < y1 && y2 < y3)
                    System.out.println(x3 - x1);
                else
                    System.out.println(0);
            } else
                System.out.println(0);

        }

    }
}
