package codeforces.practise;

import java.util.Scanner;

public class conv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ind= str.indexOf('.');
        String sub1=str.substring(0, ind);
        String sub2=str.substring(ind+1, str.length());
        int decimal1=Integer.parseInt(sub1);
        int decimal2=Integer.parseInt(sub2);
        int binary1[] = new int[1000];   
        int binary2[] = new int[1000];  
        int index1 = 0;
        int index2 = 0;
       
        while(decimal1 > 0){    
          binary1[index1] = decimal1%2;    
          decimal1 = decimal1/2;  
          index1++;  
        }    
        for(int i = index1-1;i >= 0;i--){    
          System.out.print(binary1[i]);    
        }    

        System.out.print(".");
         double d=decimal2/Math.pow(10,sub2.length());
        // System.out.println( decimal2/Math.pow(10,sub2.length()));
        while(d  < 1){    
            binary2[index2] =(int)(d*2);    
            d = d*2;  
            index2++;  
            
          }    
          for(int i = 0;i < binary2.length;i++){     
            System.out.print(binary2[i]);    
          }    


    }
}
