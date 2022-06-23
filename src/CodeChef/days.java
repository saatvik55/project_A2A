package CodeChef;

import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            while (n-- > 0) {
                int v = sc.nextInt();
                if (v == 6 || v == 13 || v == 20 || v == 27 || v == 7 || v == 14 || v == 21 || v == 28) {
                } else
                    count++;
            }
            System.out.println(8+count);
        }
    }
}
