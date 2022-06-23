package codeforces;

import java.util.Scanner;

public class count {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // int fayada=0;
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            int c1 = 0, c2 = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '0')
                    c1++;
                else if (s.charAt(j) == '1')
                    c2++;
            }
            if (c1 > c2)

                System.out.println(c2);
            else if (c2 > c1)
                System.out.println(c1);
            else if (c2 == c1 || c1 == 0 || c2 == 0)
                System.out.println(0);

        }
    }
}
