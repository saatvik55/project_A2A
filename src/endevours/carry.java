package endevours;

import java.util.Scanner;

public class carry {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        int l1 = (Long.toString(a)).length();
        long b = sc.nextLong();
        int l2 = (Long.toString(b)).length();
        long c = a + b;
        int l3 = (Long.toString(c)).length();
        if (l3 > l1 && l3 > l2)
            {System.out.println("Hard");
            System.out.println(c);}
        else
            {System.out.println("Easy");
            System.out.println(c);}
    }
}
