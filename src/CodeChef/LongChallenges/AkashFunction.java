package CodeChef.LongChallenges;

import java.util.Arrays;
import java.util.Scanner;

public class AkashFunction {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            long l = sc.nextLong();
            long count=0;
            for (int i = 1; i <= l; i++)
            {
                if(i%2==1)
                count++;
            }
            // if(isPrime(l))
            System.out.println(count);
            // else
            // System.out.println(count-1);
        }
    }


    // public static boolean isPrime(long n) {  
    //     if (n <= 1) {  
    //         return false;  
    //     }  
    //     for (int i = 2; i < Math.sqrt(n); i++) {  
    //         if (n % i == 0) {  
    //             return false;  
    //         }  
    //     }  
    //     return true;  
    }  
}
