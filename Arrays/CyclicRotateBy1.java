package Arrays;

import java.util.*;

public class CyclicRotateBy1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter Array: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int value = a[a.length-1];        //last element captured
        for(int i=a.length-1; i>0; i--){
            a[i] = a[i-1];                //opposite loop so that same value don't get copied every time
        }
        a[0] = value;

        System.out.println("Cyclically rotated array by one: ");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}