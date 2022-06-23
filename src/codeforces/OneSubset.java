 package codeforces;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class OneSubset {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            Integer[] arr=new Integer[n];
            for (int j = 0; j < n; j++) {
          arr[j]=sc.nextInt();
            
            }
            int min=Collections.min(Arrays.asList(arr));
            int max=Collections.max(Arrays.asList(arr));
            System.out.println(max-min);
            //hey
        }
        sc.close();
    }
}
