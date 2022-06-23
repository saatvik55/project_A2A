package CodeChef.LongChallenges;

import java.util.Scanner;

public class wordle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String v = sc.next();
            if (s.charAt(0) == v.charAt(0))
                System.out.print("G");
            else
                System.out.print("B");
            if (s.charAt(1) == v.charAt(1))
                System.out.print("G");
            else
                System.out.print("B");
            if (s.charAt(2) == v.charAt(2))
                System.out.print("G");
            else
                System.out.print("B");
            if (s.charAt(3) == v.charAt(3))
                System.out.print("G");
            else
                System.out.print("B");
            if (s.charAt(4) == v.charAt(4))
                System.out.print("G");
            else
                System.out.print("B");
            System.out.println();
        }

    }
}
