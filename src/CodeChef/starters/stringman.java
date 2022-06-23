package CodeChef.starters;

import java.util.Scanner;

public class stringman {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int l = sc.nextInt();
                String s = sc.next();
                String s2 = "";
                int slen = 0;
                int time = 0;
                for (int i = 0; i < l; i++) {
                
                    int count = 1;
                    while (i + 1 < s.length()
                        && s.charAt(i)
                                == s.charAt(i + 1)) {
                        i++;
                        count++;
                    }
                    if (count % 2 == 0) {
                                time += count / 2;
                            } else {
                                time += count / 2 + 1;
                            }
                    
                }
                System.out.println(time);
            }
    }
}
