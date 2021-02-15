package Arrays;

import java.util.*;

public class MaxContigousSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter Array: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        int res = Integer.MIN_VALUE, sum = 0;
        for(int i=0; i<n; i++){
            sum+=a[i];
            if(res<sum){
                res = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        System.out.println("Maximum sum of contiguous array: "+res);
        sc.close();
    }
}
