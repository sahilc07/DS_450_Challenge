package Arrays;

import java.util.*;

public class DuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter Array: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        Set <Integer> seen = new HashSet<>();

        System.out.println("Duplicate element: ");
        for(int value: a){
            if(seen.contains(value)){
                System.out.println(value);
                break;
            }
            seen.add(value);
        }

        sc.close();
        
    }
}
