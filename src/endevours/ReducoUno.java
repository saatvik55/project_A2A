package endevours;

import java.util.Scanner;

/**
 * ReducoUno
 */
public class ReducoUno {

    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num;
        for (int i = 0; i < n; i++) {
            num=sc.nextInt();
            if(num%2!=0)
            count++;pp

        }
        if (count%2==0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}