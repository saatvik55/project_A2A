package hashcode;

import java.util.Scanner;

public class pizza {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int likes = sc.nextInt();
            String[] arr1 = new String[likes];
            for (int j = 0; j < likes; j++) {
                arr1[j] = sc.next();
            }

            int dislikes = sc.nextInt();
            String[] arr2 = new String[likes];
            for (int j = 0; j < dislikes; j++) {
                arr2[j] = sc.next();
            }
        }
        
    }
}
