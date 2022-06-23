package CodeChef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class randd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // int fayada=0;
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            double avg = (x + y + z) / 2.0;
            ArrayList<Integer> arr1 = new ArrayList<>();
            arr1.add(0, a);
            arr1.add(1, b);
            arr1.add(2, c);
            ArrayList<Integer> arr2 = new ArrayList<>();
            arr2.add(0, x);
            arr2.add(1, y);
            arr2.add(2, z);

            int diff0 = arr2.get(0) - arr1.get(0);
            int diff1 = arr2.get(1) - arr1.get(1);
            int diff2 = arr2.get(2) - arr1.get(2);

            // min = Math.min(a, b);
            // min = Math.min(min, c);
            // int sum = (a + b + c) - min;

            // max = Math.max(x, y);
            // max = Math.max(max, z);

            if (diff0 >= diff1 && diff0 >= diff2)
                a = x;
            else if (diff1 >= diff2 && diff1 >= diff0)
                b = y;
            else if (diff2 >= diff1 && diff2 >= diff0)
                c = z;

            int total = a + b + c;
            // System.out.println(diff0);
            // System.out.println(diff1);
            // System.out.println(diff2);

            if (total > avg)
                System.out.println("YES");
            else if (total <= avg)
                System.out.println("NO");
        }
    }
}
