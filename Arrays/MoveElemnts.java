package Arrays;

import java.util.*;

public class MoveElemnts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter Array: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int low = 0;
        for(int i=0; i<n; i++){
            if(a[i]<0){
                if(i!=low){
                    int temp = a[low];
                    a[low] = a[i];
                    a[i] = temp;
                }
                low++;
            }else{
                continue;
            }
        }

        System.out.println("Shifted Array: ");
        for(int i=0; i<n; i++){
            System.out.println(a[i]+" ");
        }
        sc.close();
    }
}
