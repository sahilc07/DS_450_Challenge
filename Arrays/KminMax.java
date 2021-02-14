package Arrays;

import java.util.*;

public class KminMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter Array: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter K value: ");
        int k = sc.nextInt();
        Arrays.sort(a);
        int min = a[k-1];
        int max = a[n-k];

        System.out.println("Kth max value: "+max);
        System.out.println("Kth min value: "+min);
        sc.close();
    }
}
