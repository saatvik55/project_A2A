    import java.util.*;
    public class direction {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                long x = sc.nextLong();
                long y = sc.nextLong();

                if (x == 1 && y == 1) {
                    System.out.println(0);
                }

                else if (x == 1 && y - x >= 2)
                    System.out.println(-1);
                else if (y == 1 && x - y >= 2)
                    System.out.println(-1);

                    else if(x==y)
                    {
                        System.out.println(2*x-2);
                    }

                else if (x > y) {
                    long diff = x - y;
                    long diag = y * 2 - 2;
                    if (diff % 2 == 0)
                        System.out.println(diag + (diff * 2));
                    else
                        System.out.println(diag + ((diff * 2) - 1));

                }

                else if (y > x) {
                    long diff = y - x;
                    long diag = x * 2 - 2;
                    if (diff % 2 == 0)
                        System.out.println(diag + (diff * 2));
                    else
                        System.out.println(diag + ((diff * 2) - 1));
                }
            }
        }
    }

