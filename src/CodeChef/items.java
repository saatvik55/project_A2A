package CodeChef;

import java.util.Scanner;

public class items {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();;
        while (t--> 0) {
            int v = sc.nextInt();
            int q=v/10;
            int rem=v%10;
 
            if(rem>0)
            System.out.println(q+1);
            else 
            System.out.println(q);


        }
    }
}
