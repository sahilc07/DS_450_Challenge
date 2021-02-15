package Arrays;

import java.util.*;

public class UnionAndIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array: ");
        int n1 = sc.nextInt();

        int a1[] = new int[n1];
        System.out.println("Enter first Array: ");
        for(int i=0; i<n1; i++){
            a1[i] = sc.nextInt();
        }

        System.out.println("Enter size of second array: ");
        int n2 = sc.nextInt();

        int a2[] = new int[n2];
        System.out.println("Enter Array: ");
        for(int i=0; i<n2; i++){
            a2[i] = sc.nextInt();
        }

        System.out.println("Union of arrays: ");
        union(a1, a2, n1, n2);
        System.out.println("Intersection of arrays: ");
        intersection(a1, a2, n1, n2);

        sc.close();
    }

    //Union of 2 arrays
    static void union(int a1[], int a2[], int n1, int n2){
        Set <Integer> set = new HashSet<>();
        for(int i=0; i<n1; i++){
            set.add(a1[i]);
        }
        for(int i=0; i<n2; i++){
            set.add(a2[i]);
        }

        for(int value: set){
            System.out.print(value+" ");
        }
        System.out.println();
    }

    //Intersection of 2 arrays
    static void intersection(int a1[], int a2[], int n1, int n2){
        Set <Integer> set = new HashSet<>();

        for(int i=0; i<n1; i++){
            set.add(a1[i]);
        }
        for(int i=0; i<n2; i++){
            if(set.contains(a2[i])){
                System.out.print(a2[i]+" ");
            }
        }
    }
}
