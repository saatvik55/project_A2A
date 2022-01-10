package endevours;

import java.util.Arrays;
import java.util.Scanner;

public class sweets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sw = sc.nextInt();
        int count = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        } 
        int[] arr1 = new int[n];
        arr1 = arr;
        int j=0;
        Arrays.sort(arr1);
        for (int i = 0; i <arr.length; i++) {
            if (arr1[i] <= sw ) {
                sw = sw - arr1[i];
                count++;
                System.out.print(arr1[i]+" ");
                

            }
            else
            {j=i;
            break;}

        }
       
        // if (arr1[n-1] == sw)
        //     count++;
        // System.out.println(arr[0]);
      //  if (count > 0 && count <=n) {
          if(sw>0 && sw-arr1[j]!=0)
          count--;

            System.out.println(count);
            // System.out.println("The optimal way to distribute sweets is" );
      //     System.out.println("0");
            // System.out.println("No children will be happy, no matter how the sweets are
            // distributed.");
        }

    }

