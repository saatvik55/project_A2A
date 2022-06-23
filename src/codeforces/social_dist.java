package codeforces;

public class social_dist {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long x = sc.nextLong();
            long y = sc.nextLong();
            int arr[] = new int[x];
            for (int j = 0; j < x; j++) {
                arr[j] = sc.nextLong();


            }
            if(x>y)
            System.out.println("NO");
            
        }
    }
}
