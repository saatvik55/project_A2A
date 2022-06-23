package CodeChef;

import java.util.Scanner;

public class blackjack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

                int diff = 21 - (a + b);
                if (diff <= 10) 
                    System.out.println(diff);
                else
                    System.out.println(-1);

            
        }
    }
}
