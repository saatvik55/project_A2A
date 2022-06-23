package CodeChef;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int total = 0;
            String MyString = sc.next();
            HashSet noDupSet = new HashSet();
            for (int i = 0; i < MyString.length(); i++) {

                String substring = MyString.substring(0, i) + MyString.substring(i + 1);

                if (noDupSet.contains(substring)) {

                } else {
                    noDupSet.add(substring);
                    total++;
                }
            }
            // System.out.println(noDupSet.size());
            System.out.println(total);
        }
    }
}
