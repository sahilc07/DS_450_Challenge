package Arrays;

import java.util.*;

public class AlternateRearrange{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        rearrange(a, n);
        System.out.println("Rearranged array: ");
        for(int value: a){
            System.out.print(value+" ");
        }
        sc.close();
    }

    static void rearrange(int a[], int n){
        int wrongIndex = -1;
        for(int i=0; i<n; i++){
            if(wrongIndex!=-1){
                if((a[wrongIndex]>=0 && a[i]<0) || (a[wrongIndex]<0 && a[i]>=0)){
                    rotateArray(a, wrongIndex, i);
                    if(i-wrongIndex >=2) wrongIndex+=2;
                    else wrongIndex=-1;

                } 
            }else{
                if((a[i]<0 && i%2!=0) || (a[i]>=0 && i%2==0)){
                    wrongIndex = i;
                }
            }
        }
    }

    static void rotateArray(int a[], int from, int to){
        int temp = a[to];
        for(int i=to; i>from; i--){
            a[i] = a[i-1];
        }
        a[from] = temp;
    }
}