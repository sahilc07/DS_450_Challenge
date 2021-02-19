package Arrays;

import java.util.*;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter Array: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Next Permutation: ");
        int idx = -1;
        for(int i=n-1; i>0; i--){
            if(a[i-1]<a[i]){
                idx = i;
                break;
            }
        }

        if(idx == -1){
            for(int i=n-1; i>=0; i--){
                System.out.print(a[i]+" ");
            }
        }else{
            int prev = idx;
            for(int i=idx+1; i<n; i++){
                if(a[i]>a[idx-1] && a[i]<=a[prev]){
                    prev = i;
                }
            }
            int temp = a[idx-1];
            a[idx-1] = a[prev];
            a[prev] = temp;

            int start = idx+1, end = n-1;
            while(start<end){
                temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                start++;
                end--;
            }
            for(int i=n-1; i>=0; i--){
                System.out.print(a[i]+" ");
            }
        }
        sc.close();
    }
}
