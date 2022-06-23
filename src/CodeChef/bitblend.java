package CodeChef;

import java.io.*;
import java.util.*;

public class bitblend {
    
    public static long[] b1 = new long[200002];
    public static long[] b2 = new long[200002];
    public static long B1 = 0;
    public static long B2 = 0;

    public static void function1(long x, long y) {
        b1[(int) B1] = x;
        B1++;
        b1[(int) B1] = y;
        B1++;
    }

    public static void function2(long x, long y) {
        b2[(int) B2] = x;
        B2++;

        b2[(int) B2] = y;
        B2++;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        long t;
        t = sc.nextLong();
        while ((t--) != 0) {
            B1 = 0;
            B2 = 0;

            long count_1 = 0;
            long count_2 = 0;

            long n;
            n = sc.nextLong();
            long[] a = new long[(int) n];
            long[] A = new long[(int) n];

            long Y1 = 0;
            long Y = 2;
            long y1 = 0;
            long y = 0;

            long odd_check = 0;
            for (long i = 0; i < n; i++) {
                a[(int) i] = sc.nextLong();
                A[(int) i] = a[(int) i];
            }
            if (a[0] % 2 == 0) {
                if (a[1] % 2 == 0) {

                    for (long i = 2; i < n; i++) {
                        if (a[(int) i] % 2 == 1) {
                            Y1 = a[(int) i];
                            y1 = i;
                            odd_check = 1;

                            a[1] = a[1] ^ Y1;

                            count_1++;
                            function1(1, y1);
                            break;
                        }
                    }

                } else {
                    Y1 = a[1];
                    y1 = 1;
                    odd_check = 1;
                }
                Y = a[1];
                y = 1;
                for (long i = 2; i < n; i++) {
                    if (a[(int) i] % 2 == 1) {
                        a[(int) i] = a[(int) i] ^ Y;
                        count_1++;
                        function1(i, y);
                    }

                    i++;
                    if (i < n) {
                        if (a[(int) i] % 2 == 0) {
                            a[(int) i] = a[(int) i] ^ Y;
                            count_1++;
                            function1(i, y);
                        }
                    }
                }
                A[0] = A[0] ^ Y1;
                count_2++;
                function2(0, y1);

                Y = A[0];
                y = 0;

                for (long i = 1; i < n; i++) {
                    if (A[(int) i] % 2 == 1) {
                        A[(int) i] = A[(int) i] ^ Y;
                        count_2++;

                        function2(i, y);
                    }
                    i++;
                    if (i < n) {
                        if (A[(int) i] % 2 == 0) {
                            A[(int) i] = A[(int) i] ^ Y;
                            count_2++;
                            function2(i, y);
                        }
                    }
                }
            } else {
                odd_check = 1;
                Y = A[0];
                y = 0;
                for (long i = 1; i < n; i++) {
                    if (a[(int) i] % 2 == 1) {

                        a[(int) i] = a[(int) i] ^ Y;
                        count_1++;
                        function1(i, y);
                    }
                    i++;
                    if (a[(int) i] % 2 == 0 && i < n) {
                        a[(int) i] = a[(int) i] ^ Y;
                        count_1++;
                        function1(i, y);
                    }
                }

                Y = A[0];
                y = 0;

                for (long i = 1; i < n; i++) {
                    if (A[(int) i] % 2 == 0) {
                        A[(int) i] = A[(int) i] ^ Y;
                        count_2++;
                        function2(i, y);

                    }

                    i++;
                    if (A[(int) i] % 2 == 1 && i < n) {
                        A[(int) i] = A[(int) i] ^ Y;
                        count_2++;
                        function2(i, y);
                    }
                }

                A[0] = A[0] ^ A[1];
                count_2++;
                function2(0, 1);
            }
            if (odd_check == 0) {
                System.out.print("-1\n");
            } else if (count_1 > count_2) {
                long j;
                System.out.print(count_2);
                System.out.print("\n");

                for (long i = 0; i < count_2; i++) {
                    j = i * 2;
                    System.out.print(b2[(int) j] + 1);
                    System.out.print(" ");
                    System.out.print(b2[(int) (j + 1)] + 1);
                    System.out.print("\n");
                }
            } else {
                int j;
                System.out.print(count_1);
                System.out.print("\n");
                for (long i = 0; i < count_1; i++) {
                    j = (int) (i * 2);
                    System.out.print(b1[j] + 1);
                    System.out.print(" ");
                    System.out.print(b1[j + 1] + 1);
                    System.out.print("\n");
                }
            }
        }

    }
}
