package hashcode;

import java.util.Scanner;

public class divi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextInt();

            long tem = 0;
            int count = 0;
            String s = Long.toString(n);
            long min = Integer.parseInt(s);
            long min2=0;
            String ns = "";
            for (char i = '0'; i < '9'; i++) {
                for (char j = 0; j < s.length(); j++) {
                    ns = s.substring(0, j) + i + s.substring(j, s.length());
                    if (Integer.parseInt(ns) % 9 == 0 && ns.charAt(0) != '0') {
                        count++;
                        if (count == 1) {

                            min = Math.min(min, Integer.parseInt(ns));
                            // System.out.println(min);
                            count++;
                            continue;
                        }
                        min2=min;
                        min2=Math.min(min2, Integer.parseInt(ns));

                    }
                }
            }
            System.out.println("Case #"  + ": "+min2);
        }
    }
}