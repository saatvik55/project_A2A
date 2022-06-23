import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;

public class free {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int ct = 1;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int aa = a;
            int bb = b;
            String bita = (Integer.toBinaryString(aa));
            String bitb = (Integer.toBinaryString(bb));
            char lasta, lastb;
            int rem = 0;
            if (b == a + 1)
                System.out.println(1);
            else {
                // while (aa != bb) {
                aa = a;
                bb = b;
                // System.out.println(bita+" "+ bitb);

                if ((aa | bb) == bb) {
                    System.out.println(1);
                }

                else {
                    for (int j = 0; j < Integer.toBinaryString(bb).length(); j++) {
                        lasta = bita.charAt(j);
                        lastb = bitb.charAt(j);
                        if (lastb >= lasta) {
                            bita = bita.substring(j + 1);
                            bitb = bitb.substring(j + 1);
                            ct++;
                        } else {
                            break;
                        }
                    }

                    rem = (a % ((int) Math.pow(10, Integer.toBinaryString(bb).length() - ct)))
                            - (b % ((int) Math.pow(10, Integer.toBinaryString(bb).length() - ct)));
                    System.out.println(rem);
                }
                
                // System.out.println(ct);
                // System.out.print(a % ((int) Math.pow(10, ct))+" ");
                // System.out.print(b % ((int) Math.pow(10, ct)));
            }
            ct=0;
        }
    }
}