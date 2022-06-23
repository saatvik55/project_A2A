package CodeChef;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m1 = 0, m2 = 0, m3 = 0, m4 = 0, m5 = 0, m6 = 0;
        int t1 = 0, t2 = 0;
        for (int i = 0; i < t; i++) {
            m1 = sc.nextInt();
            m2 = sc.nextInt();
            m3 = sc.nextInt();
            m4 = sc.nextInt();
            m5 = sc.nextInt();
            m6 = sc.nextInt();

            t1 = m1 + m2 + m3;
            t2 = m4 + m5 + m6;
            if (t1 > t2) {
                System.out.println("Dragon");
            } else if (t1 < t2) {
                System.out.println("Sloth");
            } else if (t1 == t2) {
                if (m1 > m4)
                    System.out.println("Dragon");
                else if (m1 < m4)
                    System.out.println("Sloth");
                else if (m1 == m4) {
                    if (m2 > m5) {
                        System.out.println("Dragon");
                    } else if (m2 < m5) {
                        System.out.println("Sloth");
                    } else if (m2 == m5) {
                        if (m3 > m6) {
                            System.out.println("Dragon");
                        } else if (m3 < m6) {
                            System.out.println("Sloth");
                        } else if (m3 == m6) {
                            System.out.println("Tie");
                        }
                    }
                }
            }
            // sc.close();
        }
    }
}
