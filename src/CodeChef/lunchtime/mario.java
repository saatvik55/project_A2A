package CodeChef.lunchtime;

import java.util.Scanner;

public class mario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int div=y/x;
            if(z<div)
            System.out.println("0");
            else 
            System.out.println(z-div);
        }
    }
}
