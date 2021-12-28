
import java.util.Scanner;

public class tic_tac_toe {
    char[][] arr = new char[3][3];
    char player = 'X', bot = 'O';
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        tic_tac_toe object = new tic_tac_toe();
        for (int k = 0; k < 10; k++) {
        object.input();
        object.printarray();
        object.checkwin();
        object.bot();

    }
}

    void input() {
        System.out.println("Your Chance");
        System.out.println("Enter row and column number");
        int row = sc.nextInt();
        int column = sc.nextInt();
        arr[row][column] = player;
    }

    void printarray() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    void checkwin() {
        int flag_row = 0, flag_col = 0, diag1 = 0, diag2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == player)
                    flag_row++;
                if (arr[j][i] == player)
                    flag_col++;
                if (arr[i][i] == player)
                    diag1++;
                if (arr[i][j] == player && i + j == 2)
                    diag2++;

            }
            if (flag_row == 3 || flag_col == 3) {
                System.out.println("You Win!!");
            } else {
                flag_row = 0;
                flag_col = 0;

            }
            if (diag1 == 3 || diag2 == 3) {
                System.out.println("You Win!!");
            }
        }
    }

    void bot() {
        int i;
        int j;
        int flag_row = 0, flag_col = 0, diag1 = 0, diag2 = 0;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {

                if (arr[i][j] == player)
                    flag_row++;
                if (arr[j][i] == player)
                    flag_col++;
                if (arr[i][i] == player)
                    diag1++;
                if (arr[i][j] == player && i + j == 2)
                    diag2++;
            }
            if (flag_row == 2 || flag_col == 2) {
                for (int m = i; m < arr.length; m++) {
                    for (int n = j; n < arr.length; n++) {
                        if (arr[m][n] == ' ') {
                            arr[m][n] = bot;
                            continue;
                        }
                    }
                }
            }
            if (diag1 == 2 || diag2 == 2) {
                for (int m = i; m < arr.length; m++) {
                    for (int n = j; n < arr.length; n++) {
                        if (arr[m][n] == ' ') {
                            arr[m][n] = bot;
                            continue;
                        }
                    }
                }
            }
        }
    }
}
