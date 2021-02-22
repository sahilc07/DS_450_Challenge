package Strings;

import java.util.*;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();
        System.out.println("Duplicate characters: ");
        duplicate(s);
        sc.close();
    }
    static void duplicate(String s){
        HashMap <Character,Integer> res = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            if(res.containsKey(s.charAt(i))==false){
                res.put(s.charAt(i), 1);
            }else{
                int v = res.get(s.charAt(i));
                res.put(s.charAt(i), v+1);
            }
        }
        for(Map.Entry mapElement: res.entrySet()){
            char key = (char) mapElement.getKey();
            int value = (int) mapElement.getValue();
            if(value>1){
                System.out.println(key+" count= "+value+" ");
            }
            
        }
    }
}
