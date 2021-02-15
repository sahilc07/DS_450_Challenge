package Arrays;

import java.util.*;

public class MinimizeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter Array: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter value: ");
        int k = sc.nextInt();
        
        int small = a[0]+k, big = a[n-1]-k;
        for(int i=1; i<n-1; i++){
            int sub = a[i]-k, add = a[i]+k;
            if(sub>=small || add<=big){
                continue;
            }else if(big-sub<=add-small){
                small = sub;
            }else{
                big = add;
            }
        }
        System.out.println("Minimum Height Difference: ");
        System.out.println(Math.min(big-small, a[n-1]-a[0]));
        sc.close();
    }
}
