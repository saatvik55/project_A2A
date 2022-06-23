package CodeChef.cookoff;

import java.util.Arrays;
import java.util.Scanner;

public class fruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int total = 0;
            int arr[] = new int[3];
            int x = sc.nextInt();
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();

            Arrays.sort(arr);

            total = (x - 1) * arr[0];
            total += arr[1];
            System.out.println(total);
        }
    }
}
