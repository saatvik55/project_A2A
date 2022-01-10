import java.util.Scanner;

 class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        printNumbers(n, d);
    }

    // Returns true if d is present as digit
    // in number x.
    static boolean isDigitPresent(int x, int d) {
        // Breal loop if d is present as digit
        while (x > 0) {
            if (x % 10 == d)
                break;

            x = x / 10;
        }

        // If loop broke
        return (x > 0);
    }

    // function to display the values
    static void printNumbers(int n, int d) {
        // Check all numbers one by one
        for (int i = 0; i <= n; i++)

            // checking for digit
            if (i == d || isDigitPresent(i, d))
                System.out.print(i + " ");
    }

}