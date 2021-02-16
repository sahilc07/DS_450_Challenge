package Arrays;

import java.util.*;

public class MergeWithoutSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array 1: ");
        int n = sc.nextInt();

        int a1[] = new int[n];
        System.out.println("Enter Array 1: ");
        for(int i=0; i<n; i++){
            a1[i] = sc.nextInt();
        }
        System.out.println("Enter size of array 2: ");
        int m = sc.nextInt();

        int a2[] = new int[m];
        System.out.println("Enter Array 2: ");
        for(int i=0; i<m; i++){
            a2[i] = sc.nextInt();
        }
        
        int i = n-1, j = 0;

        while(j<m && i>=0){
            if(a1[i]>a2[j]){
                int temp = a1[i];
                a1[i] = a2[j];
                a2[j] = temp;
            }
            i--;
            j++;
        }

        Arrays.sort(a1);
        Arrays.sort(a2);

        System.out.println("Merged Arrays: ");
        for(int v1: a1){
            System.out.println(v1+" ");
        }
        for(int v2: a2){
            System.out.println(v2+" ");
        }

        sc.close();
    }
}
