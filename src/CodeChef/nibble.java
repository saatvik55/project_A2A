package CodeChef;

import java.util.Scanner;

public class nibble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a % 4 == 0)
                System.out.println("Good");
            else
                System.out.println("Not Good");
        }
    }
}
