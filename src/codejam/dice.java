package codejam;

    import java.util.Arrays;
    import java.util.Scanner;

    public class dice {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int count = 0;
            while (count++ < n) {
                int x = sc.nextInt();
                int[] array = new int[x];
                for (int i = 0; i < x; i++) {
                    array[i] = sc.nextInt();
                }

                System.out.print("Case #" + count + ":");
                Arrays.sort(array);
                if (n == 1)
                    System.out.println("1");
                else {
                    int flag = 1;
                    for (int i = 1; i < array.length; i++) {
                        if (array[i] > flag)
                            flag++;
                    }
                    System.out.println(flag);
                }
            }
        }
    }
