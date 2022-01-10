
import java.util.*;

class GFG {

    // Main class
    public static class Main {
        int x;
        int y;

        Main(int x, int y) {
            this.x = x;
            this.y = y;pp
        }
    }

    // Function to calculate the maximum
    // Manhattan distance
    static void MaxDist(ArrayList<Main> A, int N) {

        // ArrayLists to store maximum and
        // minimum of all the four forms
        ArrayList<Integer> V = new ArrayList<>();
        ArrayList<Integer> V1 = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            V.add(A.get(i).x + A.get(i).y);
            V1.add(A.get(i).x - A.get(i).y);
        }

        // Sorting both the ArrayLists
        Collections.sort(V);
        Collections.sort(V1);

        int maximum = Math.max((V.get(V.size() - 1) - V.get(0)),
                (V1.get(V1.size() - 1) - V1.get(0)));

        System.out.println(maximum);
    }

    // Driver Code
    public static void main(String[] args)
    {
        int n = 3;
 
        ArrayList<Main> al = new ArrayList<>();

    // Given Co-ordinates
    Main p1 = new Main(1, 2);al.add(p1);
    Main p2 = new Main(2, 3);al.add(p2);
    Main p3 = new Main(3, 4);al.add(p3);

    // Function call
    MaxDist(al, n);
    }}
    
