package CodeChef.starters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class arrayAltsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            long sum = 0;
            int arr[] = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = Math.abs(sc.nextInt());
            }

            int save[]=arr.clone();

            for (int i = 0; i < n; i++) {
                if (i % 2 == 1)
                    arr[i] = -arr[i];

            }
            for (int i = 0; i < n; i++) {
                sum=sum + arr[i];
            }
            
            int arr2[]=arr;
            Arrays.sort(arr2);
            long min=Math.abs(arr2[0]);
            long diff=0;
            for (int i = 0; i < n; i++) {
                if(i%2==0 && min>save[i]) {
                    diff=Math.max(diff, min-save[i]);
                }
            }
            // System.out.println(min);
            System.out.println(sum +diff*2);
            // System.out.println(sum);
            // System.out.println(Arrays.toString(save));
            // System.out.println(Arrays.toString(arr2));

        }
    }
}