package codeforces;

// Java program for the above approach
import java.io.*;
import java.util.Scanner;

class GFG {

    // This function is used to find
    // minimum distance between same
    // repeating characters
    static int shortestDistance(String S, int N) {

        // Store minimum distance between same
        // repeating characters
        int minDis = S.length();

        // For loop to consider each element
        // of string
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {

                // Comparison of string characters and
                // updating the minDis value
                if (S.charAt(i) == S.charAt(j) &&
                        (j - i) < minDis) {
                    minDis = j - i;

                    // As this value would be least
                    // therefore break
                    break;
                }
            }
        }

        // If minDis value is not updated that means
        // no repeating characters
        if (minDis == S.length())
            return -1;

        // Minimum distance is minDis - 1
        else
            return minDis - 1;
    }

    // Driver code
    public static void main(String[] args) {

        // Given input
        Scanner sc=new Scanner(System.in);
        String S = sc.next();
        int N = S.length();

        // Function call
        System.out.println(shortestDistance(S, N));
    }
}

// This code is contributed by MuskanKalra1
