package Arrays;

import java.util.*;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter Array: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int sum = a[0], res = a[0];
        for(int i = 1; i<n; i++){
            sum = Math.max(a[i], sum+a[i]);
            if(res<sum){
                res = sum;
            }
        }
        System.out.println("Max contigous sum: "+res);
        sc.close();
    }
}
