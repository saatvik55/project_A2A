package CodeChef;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ChefAndFd
 */
public class ChefAndFd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int sum=0,count=1;
            int n=sc.nextInt();
            int x=sc.nextInt();
            int[] arr=new int[n];
            for (int j = 0; j < arr.length; j++) {
                arr[j]=sc.nextInt();    

            }
            Arrays.sort(arr);
            for (int j = n-1; j >=0; j--) {
                sum+=arr[j];
                if(sum<x)
                count++;
                if (sum>=x)
                {System.out.println(count);
                    count=1;
                break;}
            }
            if(sum<x)
            System.out.println("-1");
            // sum=0;
            // count=1;
            
        }
    }
}