package CodeChef;

import java.util.Scanner;

public class xor {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
		    int n = scan.nextInt();
		    if(n<3){
		        System.out.println(-1);
		        continue;
		    }
		    if(n%2 == 1) 
		    {
		        for( int i=1;i<=n; i++) System.out.print(i+" ");
		        System.out.println();
		    }
		    else
		    {
		        for( int i=1; i<=n-3; i++) System.out.print(i+" ");
		        System.out.print(n+" ");
		        for( int i=n-2; i<n; i++)System.out.print(i+" ");
		        System.out.println();
		    }
		}
    }
}
