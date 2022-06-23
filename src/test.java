import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            ArrayList<Integer> arr1 = new ArrayList<>();
            int m = sc.nextInt();
            ArrayList<Integer> arr2 = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                arr1.add(j, sc.nextInt());
            }
            for (int j = 0; j < n; j++) {
                arr2.add(j, sc.nextInt());
            }
            // ArrayList<Integer> arr3 = new ArrayList<>();
            for (int j = 0; j < n + m; j++) {
                int index=arr1.indexOf(Collections.max(arr1));
                if (Collections.max(arr1) >= Collections.min(arr2)) {
                    arr1.add(j, Collections.min(arr1));
                    arr1.remove(Collections.min(arr1));
                }
                else if(Collections.min(arr1) < Collections.min(arr2))
                {
                    arr1.add(j, Collections.min(arr2));
                    arr1.remove(Collections.min(arr2));
                }
            }
        }
    }
}