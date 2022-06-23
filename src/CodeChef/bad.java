package CodeChef;

import java.util.Scanner;

public class bad {
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
            int min = 0;
            int max = 0;
            min = Math.min(a, b);
            min = Math.min(min, c);
            int sum = (a + b + c) - min;

            max = Math.max(x, y);
            max = Math.max(max, z);
            System.out.println(min+" "+max+" "+avg+" "+sum);
            int total = sum + max;
            if (total > avg || (a+b+c) >avg)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
