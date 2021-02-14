package Arrays;

import java.util.*;

public class Sort012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter Array (0,1,2 only): ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int low = 0, mid = 0, high = n-1;
        while(mid<=high){
            if(a[mid] == 0){
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                mid++;
                low++;
            }else if(a[mid] == 1){
                mid++;
            }else{
                int temp = a[high];
                a[high] = a[mid];
                a[mid] = temp;
                high--;
            }
        }

        System.out.println("Sorted Array: ");
        for(int i=0; i<n; i++){
            System.out.println(a[i]+" ");
        }
        sc.close();
    }
}
