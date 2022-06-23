package CodeChef;

import java.util.Scanner;

public class cards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int left=0;
        
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            left=52%n;
            System.out.println(left);
        }
    }
}
