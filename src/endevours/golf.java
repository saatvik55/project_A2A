package endevours;

import java.util.Scanner;

public class golf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                c++;
                System.out.println("OK");
                break;
            }

        }
        if (c == 0)
            System.out.println("NG");
    }
}
