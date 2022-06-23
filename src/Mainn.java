import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ct = 0;
        int row1 = 0, row2 = 0;
        int arr[][] = new int[2][n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
    
            }
        }
        int candy = arr[0][0] + arr[1][n - 1];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0)
                    row1 += arr[i][j];
                if (i == 1)
                    row2 += arr[i][j];
            }
        }
        row1 = row1 - arr[0][0];
        row2 = row2 - arr[1][n - 1];
        // System.out.println(row1 +" "+ row2);
        int r = 0, c = 0;
        while (n-1 > 0) {

            if (row2 > row1 && arr[r][c + 1] < arr[r + 1][c]) {
                // row2 = row2 + arr[r][c-1];
                System.out.println(candy + row2);
                ct++;
                break;
            } else if (arr[r][c + 1] >= arr[r + 1][c] || row1 > row2) {
                candy = candy + arr[r][c + 1];
                row1 = row1 - arr[r][c + 1];
                row2 = row2 - arr[r + 1][c];

            }
            c++;
            n--;
        }
        if (ct == 0)
            System.out.println(candy);
        // System.out.println(arr[0][0] +" "+ arr[1][n - 1]);
    }
}
