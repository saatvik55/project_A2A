    package codejam;

    import java.util.Scanner;

    public class pattern {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int count=0;
            while (count++ < n) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println("Case #" + count + ":");
                System.out.print("..");
                for (int i = 1; i <= y * 2 - 1; i++) {
                    if (i % 2 == 1)
                        System.out.print("+");
                    else
                        System.out.print("-");

                }
                System.out.println();
                System.out.print("..");
                for (int i = 1; i <= y * 2 - 1; i++) {
                    if (i % 2 == 1)
                        System.out.print("|");
                    else
                        System.out.print(".");

                }
                System.out.println();
                for (int i = 1; i <= y * 2 + 1; i++) {
                    if (i % 2 == 1)
                        System.out.print("+");
                    else
                        System.out.print("-");

                }
                System.out.println();
                while (--x > 0) {
                    for (int i = 1; i <= y * 2 + 1; i++) {
                        if (i % 2 == 1)
                            System.out.print("|");
                        else
                            System.out.print(".");

                    }
                    System.out.println();
                    for (int i = 1; i <= y * 2 + 1; i++) {
                        if (i % 2 == 1)
                            System.out.print("+");
                        else
                            System.out.print("-");

                    }
                    System.out.println();
                }
            }
        }
    }
