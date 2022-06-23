// package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class horseshoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // // int fayada=0;
        // for (int i = 0; i < t; i++) {

        int[] arr = { sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt() };
        Arrays.sort(arr);
        // int c1, c2, c3, c4;
        int max = 0;
        int same = 0;
        for (int j = 0; j < arr.length; j++) {
            int count = 1;

            for (int k = j + 1; k < arr.length; k++) {
                if (arr[j] == arr[k]) {
                    count++;
                }

            }
            if (count == 2)
                same++;

            max = Math.max(max, count);
        }
        // System.out.println(Arrays.toString(arr));
        if (max == 1)
            System.out.println("0");
        else if (max == 4)
            System.out.println("3");
        else if (max == 2 && same == 1)
            System.out.println("1");
        else if (max == 2 && same == 2)
            System.out.println("2");
        else if (max == 3)
            System.out.println("2");
    }
}
