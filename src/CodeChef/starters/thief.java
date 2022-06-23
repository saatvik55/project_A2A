package CodeChef.starters;

public class thief {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
           int N = sc.nextInt();
           int X = sc.nextInt();
           int[] arr = new int[N];
           for(int j=0;j<N;j++){
               arr[j] = sc.nextInt();
           }
           Arrays.sort(arr);
           int ctr=0;
           if(N>=X){
               System.out.println(N);
           }
    }
}
