package codeforces.practise;

// import java.util.Arrays;
// import java.util.Random;
import java.util.Scanner;

/**
 * arrays
 */
public class arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int array[] = new int[n];
            for (int j = 0; j < n; j++) {
                array[j] = j + 1;
            }
            if (k*2>=n) {
                System.out.print("-1");
            } else {

                System.out.print( "1 " );
				for( int i = 1; i <= k; i++ )
					System.out.print( (2 * i + 1) + " " + (2 * i) + " " );
				for( int i = 2 * k + 2; i <= n; i++ )
					System.out.print( i + " " );
			}
                System.out.println();
            }
        }

    }
