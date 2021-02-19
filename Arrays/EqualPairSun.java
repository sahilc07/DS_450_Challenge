package Arrays;

import java.util.*;

public class EqualPairSun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter Array: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter Value: ");
        int k = sc.nextInt();

        HashMap <Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0; i<n; i++){
            int diff = k-a[i];
            Integer x = map.get(diff);
            if(x!=null){
                count+=map.get(diff);
            }
            Integer y = map.get(a[i]);
            if(y!=null){
                map.put(a[i], y+1);
            }else{
                map.put(a[i], 1);
            }
        }

        System.out.println("Total Pairs: "+count);
        sc.close();
    }
}
