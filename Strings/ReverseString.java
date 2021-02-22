package Strings;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        char ch[] = new char[n];
        System.out.println("Enter Character Array: ");
        for(int i=0; i<n; i++){
            ch[i] = sc.next().charAt(0);
        }

        int start = 0, end = n-1;
        while(start<=end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++; end--;
        }

        System.out.println("Reversed Character Array: ");
        for(char c: ch){
            System.out.print(c+" ");
        }
        System.out.println();
        sc.close();
    }
}
