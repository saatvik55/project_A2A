package CodeChef;

import java.util.Scanner;

public class nnn {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            double d1=(double)y1/x1;
            double d2=(double)y2/x2;
            if(d1>d2)
            System.out.println("-1");
            else if(d1==d2)
            System.out.println("0");
            else
                System.out.println("1");
                System.out.println(d1+" "+d2);


            }

    }
}
