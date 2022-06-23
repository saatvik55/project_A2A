// package codeforces.practise;

import java.util.Scanner;

public class scales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String str = sc.next();
        int l3 = str.length();
        String sub1 = "", sub2 = "";
        int c1 = 0;

        int del = s.indexOf('|');
        sub1 = s.substring(0, del);
        int l1 = sub1.length();
        sub2 = s.substring(del + 1, s.length());
        int l2 = sub2.length();
        if (l1 < l2) {
            // sub1 = sub1 + str;
            int diff = l2 - l1;
            if (l3 == diff)
                System.out.println(sub1 + str + "|" + sub2);
            else if (l3 > diff || l3 % diff == 0) {
                for (int i = 0; i < l3; i++) {
                    if (sub1.length() < sub2.length())
                        sub1 = sub1 + str.charAt(i);
                    else
                        sub2 = sub2 + str.charAt(i);
                }
                if (sub1.length() == sub2.length())
                    System.out.println(sub1 + "|" + sub2);
                else
                    System.out.println("Impossible");

            } else
                System.out.println("Impossible ");

        } else if (l2 < l1) {
            // sub2 = sub2 + str;
            int diff = l1 - l2;
            if (l3 == diff)
                System.out.println(sub1 + "|" + sub2 + str);
            else if (l3 > diff || l3 % diff == 0) {
                for (int i = 0; i < l3; i++) {
                    if (sub1.length() < sub2.length())
                        sub1 = sub1 + str.charAt(i);
                    else
                        sub2 = sub2 + str.charAt(i);
                }
                if (sub1.length() == sub2.length())
                    System.out.println(sub1 + "|" + sub2);
                else
                    System.out.println("Impossible");

            } else
                System.out.println("Impossible ");

        } else if (l1 == l2) {

            if (l3 % 2 == 0) {

                for (int i = 0; i < l3; i++) {
                    if (sub1.length() <= sub2.length())
                        sub1 = sub1 + str.charAt(i);
                    else
                        sub2 = sub2 + str.charAt(i);
                }
                System.out.println(sub1 + "|" + sub2);

            } else
                System.out.println("Impossible");
        }

    }
}
