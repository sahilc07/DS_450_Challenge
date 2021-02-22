package Strings;

import java.util.*;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();

        int start = 0, end = str.length()-1;
        boolean res = false;
        while(start<=end){
            if(str.charAt(start)==str.charAt(end)){
                res = true;
                start++; end--;
                continue;
            } else{
                res = false;
                break;
            }
        }

        if(res==true) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
        sc.close();
    }
}
