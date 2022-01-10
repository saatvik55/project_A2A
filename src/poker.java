import java.util.*;

public class poker {

    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < 1 || a > 13 || b < 1 || b > 13)
           { System.out.println("Wrong Input");
        System.exit(0);}
        if (a > b && b != 1)
            System.out.println("Alice");
        if (b > a && a != 1)
            System.out.println("Bob");
        if (a == b)
            System.out.println("Draw");
        else if (a == 1 && b == 1)
            System.out.println("Draw");
        else if (a == 1)
            System.out.println("Alice");
        else if (b == 1)
            System.out.println("Bob");

    }
}