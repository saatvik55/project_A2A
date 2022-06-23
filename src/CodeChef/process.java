package CodeChef;

import java.util.Scanner;

public class process {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int n = sc.nextInt();
            int arr[] = new int[n];
            int sum1 = 0;
            int sum2 = 0;
            int left = 0;
            int max1 = 0;
            int max2 = 0;

            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }

            for (int k = 0; k < arr.length; k++) {
                sum1 = sum1 + arr[k];

            }

            if (arr.length == 1)
                System.out.println(arr[0]);
            else {
                // System.out.println(sum1);
                // int sumcount = sum1;
                sum2 = sum1 - arr[0];
                left =left+arr[0];
                // System.out.println(sum2+" "+left);
                max1=Math.max(sum2,left);  
                // System.out.println("max1 = " + max1);
                for (int g = 1; g < arr.length; g++) {
                    sum2 = sum2 - arr[g];
                    left =left+arr[g];
                    max2=Math.max(sum2,left);
                    // System.out.println(sum2+" "+left);                              
                    if (max2 > max1)
                        {System.out.println(max1);
                        break;}
                    else {
                        sum1 = sum1-arr[g];
                        max1=max2;
                    }
                }
            }
        }

    }
}
