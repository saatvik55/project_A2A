// package CodeChef;
import java.util.Arrays;
import java.util.Scanner;

public class multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int sum = 0,subsum=0;
        int left = 0;
        boolean b = true;
        int count = 0;
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            while (sum != 1) {
                if (sum % 2 != 0)
                    b = false;
                sum /= 2;
            }

            if (b == true)
                System.out.println(0);

            else {
                while (true) {
                    if (Math.sqrt(sum) % 2 == 0) {
                        break;
                    } else {
                        left++;
                        sum++;
                    }
                }
                int left1=left;
                Arrays.sort(arr);
                int len = arr.length;
                int ind1=0,ind2=0;
                for (int j = len - 1; j >= 0; j--) {
                    if (arr[j] < left) {
                        subsum+=arr[j];
                        ind1=j;
                        left = left - arr[j];
                        count++;
                        if (left == 0)
                        {
                            ind2=j;
                            break;
                        }
                            
                    }

                }
                System.out.print(count+" ");
                System.out.println(subsum/left1);
                while (ind1>=ind2) {
                    System.out.println(ind1+" ");
                    ind1--;
                }

                
            }
        }
    }
}
