import java.util.Scanner;

 public class app {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int hours = sc.nextInt();
            int num = sc.nextInt();
            for (int j = num; j < hours; j++) {
                if (j == num || j==hours/10 || j==hours%10) {
                    count++;
                    hours = hours - num;
                }

            }
            if(count>=1)
            System.out.println("Yes");
            else
            System.out.println("No");
            count=0;

        }
        sc.close();
    }
}
