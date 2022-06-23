package codeforces;

import java.util.Random;
import java.util.Scanner;

public class bounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        Random ran = new Random();
        int l1, r1, l2, r2;
        String str = "";
        int sublen=0;
        int maxlen = n-1;
        int temlen=0;
        int[] arr = new int[n];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
            str = str + arr[i];
        }
        int check = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int j2 = 0; j2 < arr.length; j2++) {
                if (arr[j] == arr[j2])
                    check++;
            }
        }
        if (check == 0)
            System.out.println("-1");

        while (temlen <= maxlen) {
            //int count = 0;
            l1 = ran.nextInt(n);
            r1 = ran.nextInt(n);
            l2 = ran.nextInt(n);
            r2 = ran.nextInt(n);
            String sub1 = str.substring(l1, r1);
            String sub2 = str.substring(l2, r2);
            if (l1 != l2 && r1 != r2 && sub1.length() == sub2.length())
             {
                for (int k = 0; k < sub1.length(); k++) {
                    if (sub1.charAt(k) == sub2.charAt(k)) {
                        sublen = sub1.length();
                        // temlen = sub1.length();
                        break;
                    }
                }
                if (sublen > 0) {
                    temlen = sublen;
                        System.out.println(temlen);
                }
                else if (sublen == n - 1) {
                    System.out.println(sublen);
                }

            }

        }

    }

}
