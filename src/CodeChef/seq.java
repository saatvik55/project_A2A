package CodeChef;
import java.util.Scanner;

public class seq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0, j2 = 0;
        for (int i = 0; i < t; i++) {
            int sum = sc.nextInt();
            int[] arr = new int[29];
            int[] sumarr = new int[29];
            arr[0] = sum / 2;
            sumarr[0] = sum / 2;
             for (int j = 1; j < arr.length; j++) {
                arr[j] = arr[j - 1] / 2;
                sumarr[j] = sumarr[j-1] + arr[j - 1] / 2;

                if (arr[j] == 1) {
                    j2 = j + 1;
                    break;
                }
            }
            for (int k = 0; k < j2; k++) {
                if (arr[k] + sumarr[k] == sum) {
                    count++;
                }

            }
            System.out.println(count);
            count=0;
        }
    }
}
