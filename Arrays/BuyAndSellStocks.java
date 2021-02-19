package Arrays;

import java.util.*;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter days: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter Stock rates: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int maxProfit = 0, min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(a[i]<min){
                min = a[i];
            }else if(a[i]-min > maxProfit){
                maxProfit = a[i]-min;
            }
        }
        System.out.println("Maximum Profit: "+maxProfit);
        sc.close();
    }
}
