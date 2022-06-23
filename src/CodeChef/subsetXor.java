package CodeChef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class subsetXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                for (int j2 = j + 1;; j2++) {
                    if (arr.contains(j2) == true) {

                    } else if (Integer.bitCount(j2) % 2 == 0) {
                        arr.add(j, j2);
                        break;
                    } else {
                    }

                }
            }

            for (int j = 0; j < n; j++) {
                if (j!=n-1) {
                    if ((arr.get(j) ^ arr.get(j + 1)) == 1)
                        return;
                }
            }

            for (int j = 0; j < n; j++) {
                System.out.print(arr.get(j) + " ");
                // System.out.print(Integer.bitCount(7));
            }
        }
    }
}
