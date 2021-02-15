package Arrays;

import java.util.*;

public class MinJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter Array: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int dp[] = new int[n];
        for(int i=0; i<n; i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                if(dp[j]!=Integer.MAX_VALUE && a[j]+j>=i){
                    if(dp[j]+1 < dp[i]){
                        dp[i] = dp[j]+1;
                    }
                }
            }
        }

        System.out.print("Minimum no. of jumps to reach end of array: ");
        if(dp[n-1]!=Integer.MAX_VALUE){
            System.out.println(dp[n-1]);
        }else{
            System.out.println("-1");
        }

        sc.close();
    }
}
