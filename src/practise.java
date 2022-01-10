import java.util.Arrays;
import java.util.Scanner;

public class practise {
    public static void main(String[] args) {

        practise p = new practise();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int set = 0;
        double prob = 0;
        for (int i = 0; i < t; i++) {
            int count = 0;

            int n = sc.nextInt();
            set = p.factorial(n);
           // System.out.println(set);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] x = new int[n];

            for (int j = 0; j < n; j++) {
                x[j] = sc.nextInt();

            }
            Arrays.sort(x);
            for (int j = 1; j <= n; j+=2) {
                for (int j2 = 0; j2 < n; j2++) {
                    if (j == x[j2])
                        count++;
                }
                //System.out.println(count);
                set = set / factorial(count);
                count = 0;

            }
            prob = 1 / set;
            System.out.println(prob);
        }
       
    }

    public static int factorial(int count) {
        if (count == 1 || count == 0)
            return 1;
        else
            return count * factorial(count - 1);

    }
}
