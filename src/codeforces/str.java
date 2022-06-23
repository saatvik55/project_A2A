// package codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            char c = sc.next().charAt(0);
            String ss = c + "";
            ArrayList<Integer> list = new ArrayList<Integer>();
            int count = 0;
            if (s.length() == 1) {
                if (s.equals(ss)==true)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            if (s.length() > 1) {
                for (int i = 0; i < s.length(); i++) {

                    if (s.charAt(i) == c) {
                        list.add(i);

                    }

                }
                for (Integer ii : list) {
                    if (ii % 2 == 0)
                        count++;
                }
                // System.out.println(list);
                if (count >= 1)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
