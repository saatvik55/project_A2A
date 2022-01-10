package endevours;

import java.util.Scanner;

public class stones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[(2 * n) - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = x - (n - 1);
            n--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
