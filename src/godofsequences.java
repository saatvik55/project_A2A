import java.util.*;

class GodOfSequences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Random obj = new Random();
        int ran1, ran2, ran3 = 0;
        int total = 0;
        int pos = a;
        int neg = b - 1;
        if (a < 1 || b < 1 || a > 1000 || b > 1000) {
            System.exit(0);
        }
        for (int i = 0; i < pos; i++) {
            ran1 = obj.nextInt(1000);
            System.out.print(ran1 + " ");
            total += ran1;

        }
        if (b == 1) {
            total -= (2 * total);
            System.out.println(total);
        } else {
            ran2 = obj.nextInt(total);
            ran3 = ran2;
            ran3 = ran3 - (2 * ran2);
            System.out.print(ran3 + " ");

            for (int i = 1; i < neg; i++) {
                total += ran3;
                ran2 = obj.nextInt(total);
                ran3 = ran2;
                ran3 = ran3 - (2 * ran2);
                System.out.print(ran3 + " ");

            }
            total += ran3;
            total -= (2 * total);
            System.out.print(total);
            sc.close();
        }
    }
}