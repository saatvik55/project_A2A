package CodeChef;

import java.util.Arrays;
import java.util.Scanner;

/**
 * RGBballs
 */
public class RGBballs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // int sum = 0, count = 1;
       
        
        for (int i = 0; i < t; i++) {
            int[][] arr = new int[3][3];
            int n = sc.nextInt();
            for (int j = 0; j < arr.length; j++) {
                for (int j2 = 0; j2 < arr.length; j2++) {
                    arr[j][j2] = sc.nextInt();
                    // sum += arr[j][j2];
                }
            }
            
            int max = Math.max(arr[0][1] + arr[0][2] + arr[1][2], arr[1][0] + arr[2][0] + arr[2][1]);
            System.out.println(max);

           
        }
    }
}