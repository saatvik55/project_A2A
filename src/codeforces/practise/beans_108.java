package codeforces.practise;

import java.util.Scanner;

public class beans_108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // int fayada=0;
        for (int i = 0; i < t; i++) {
            int r = sc.nextInt();
            int b = sc.nextInt();
            int diff = sc.nextInt();
            int d = Math.abs(r - b);

            if (diff == 0 && r == b) {
                System.out.println("YES");

            } else if (diff == 0 && r != b) {
                System.out.println("NO");
            } else if (d < diff) {
                if (r > b) {
                    int net = 0;
                    int ct = 0;
                    int left=0;
                    for (int j = 1; j < r; j++) {
                        if (b >= 1) {
                            net = diff - (1);
                            b--;

                        }
                        if(net<=r)
                        left=r-net;
                        
                    
                    }

                } else if (b > r) {

                }
                // System.out.println("YES");
            } else if (d > diff) {
                System.out.println("NO");
            }

        }
    }
}
