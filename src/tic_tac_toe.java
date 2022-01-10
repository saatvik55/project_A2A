
import java.util.Scanner;

 class tic_tac_toe {
    char[][] arr = new char[3][3];
    char player = 'X', bot = '#';
    int count1=0,count2=0;

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        tic_tac_toe object = new tic_tac_toe();
        for (int k = 0; k < 10; k++) {
            object.input();
            System.out.println("Your Turn");

            object.printarray();
            object.checkwinuser();
            System.out.println("Computer's Turn");
            object.bot();
            object.printarray();
            object.checkwinbot();

        }
    }

    void input() {
        System.out.println("Your Turn");
        System.out.println("Enter row and column number");
        int row = sc.nextInt();
        int column = sc.nextInt();
        arr[row][column] = player;
    }

    void printarray() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    void checkwinuser() {
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
                System.exit(0);
            } else {
                flag_row = 0;
                flag_col = 0;

            }

            /*
             * if (diag1 == 3 || diag2 == 3) {
             * System.out.println("You Win!!");
             * System.exit(0);
             * }
             */
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                
                if (arr[i][j] != '\u0000') {
                    count1++;
                    if(count1==9)
                    System.out.println("Game Tie");
                    else
                    count1=0;

                }
            }
        }

    }

    void checkwinbot() {
        int flag_row = 0, flag_col = 0, diag1 = 0, diag2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == bot)
                    flag_row++;
                if (arr[j][i] == bot)
                    flag_col++;
                if (arr[i][i] == bot)
                    diag1++;
                if (arr[i][j] == bot && i + j == 2)
                    diag2++;

            }
            if (flag_row == 3 || flag_col == 3) {
                System.out.println("You Lose!!");
                System.exit(0);
            } else {
                flag_row = 0;
                flag_col = 0;

            }
            /*
             * if (diag1 == 3 || diag2 == 3) {
             * System.out.println("You Win!!");
             * System.exit(0);
             * }
             */
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != '\u0000') {
                    count2++;
                    if(count2==9)
                    System.out.println("Game Tie");
                    else
                    count2=0;

                }
            }
        }
    }

    void bot() {
        int i;
        int j;
        int flag_row = 0, flag_col = 0, diag1 = 0, diag2 = 0;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {

                if (arr[i][j] == player) {
                    flag_row++;
                    if (flag_row <= 2) {
                        for (int m = i; m < arr.length; m++) {
                            for (int n = 0; n < arr.length; n++) {
                                if (arr[m][n] == '\u0000') {
                                    arr[m][n] = bot;
                                    break;
                                }
                                break;
                            }
                        }
                    }

                }
                if (arr[j][i] == player) {
                    flag_col++;
                    if (flag_col <= 2) {
                        for (int m = 0; m < arr.length; m++) {
                            for (int n = j; n < arr.length; n++) {
                                if (arr[m][n] == '\u0000') {
                                    arr[m][n] = bot;
                                    break;
                                }
                                break;
                            }
                        }
                    }
                }
                if (arr[i][i] == player)
                    diag1++;
                if (arr[i][j] == player && i + j == 2)
                    diag2++;
            }
            /*
             * if (flag_row <= 2 || flag_col <= 2) {
             * for (int m = i1; m < arr.length; m++) {
             * for (int n = j1; n < arr.length; n++) {
             * if (arr[m][n] == ' ') {
             * arr[m][n] = bot;
             * continue;
             * }
             * }
             * }
             * }
             * else if (diag1 == 2 || diag2 == 2) {
             * for (int m = i; m < arr.length; m++) {
             * for (int n = j; n < arr.length; n++) {
             * if (arr[m][n] == ' ') {
             * arr[m][n] = bot;
             * continue;
             * }
             * }
             * }
             * } else {
             * for (int a = 0; a < arr.length; a++) {
             * for (int b = 0; b < arr.length; b++) {
             * if (arr[a][b] == ' ') {
             * arr[a][b] = bot;
             * continue;
             * }
             * }
             * }
             * }
             */
        }
    }
}