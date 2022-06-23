// package codeforces;

import java.util.Scanner;

public class sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;
        int min = 0;

        String str = "";
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            int len = s.length();
            for (char a = 'a'; a <= 'z'; a++) {
                for (int j = 0; j < s.length(); j++) {

                    if (s.charAt(j) == a) {
                        str = str + s.charAt(j);

                    }

                }
                
            }
            System.out.println(str);
            str="";
        }
    }
}
