package CodeChef;

import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] c = new char[h + 2][w + 2];
        for (int i = 1; i <= h; i++) {
            String s = sc.next();
            for (int j = 1; j <= w; j++) {
                c[i][j] = s.charAt(j - 1);
            }
        }

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                if (c[i][j] == '#') {
                    if (c[i - 1][j] == '#' || c[i][j - 1] == '#' || c[i][j + 1] == '#' || c[i + 1][j] == '#') {
                        continue;
                    } else {
                        System.out.println("No");
                        return;
                    }
                }
            }
        }
        System.out.println("Yes");
    }
}