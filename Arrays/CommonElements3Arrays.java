package Arrays;

import java.util.*;

public class CommonElements3Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size 1: ");
        int n1 = sc.nextInt();

        int a[] = new int[n1];
        System.out.println("Enter Array 1: ");
        for(int i=0; i<n1; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter size 2: ");
        int n2 = sc.nextInt();

        int b[] = new int[n2];
        System.out.println("Enter Array 2: ");
        for(int i=0; i<n2; i++){
            b[i] = sc.nextInt();
        }
        System.out.println("Enter size 3: ");
        int n3 = sc.nextInt();

        int c[] = new int[n3];
        System.out.println("Enter Array 3: ");
        for(int i=0; i<n3; i++){
            c[i] = sc.nextInt();
        }

        System.out.println("Common elements in 3 arrays: ");
        ArrayList <Integer> res = common(a, b, c, n1, n2, n3);
        if(res.size()==0){
            System.out.print(-1);
        }else{
            for(int i=0; i<res.size(); i++){
                System.out.print(res.get(i)+" ");
            }
        }
        sc.close();
    }

    static ArrayList<Integer> common(int a[], int b[], int c[], int n1, int n2, int n3){
        ArrayList<Integer> res = new ArrayList<>();
        int i=0, j=0, k=0;
        while(i<n1 && j<n2 && k<n3){
            if(a[i]==b[j] && b[j]==c[k]){
                res.add(a[i]);
                int value = a[i];
                while(i<n1 && a[i]==value){
                    i++;
                }
                while(j<n2 && b[j]==value){
                    j++;
                }
                while(k<n3 && c[k]==value){
                    k++;
                }
            }else if(a[i]<b[j]){
                i++;
            }else if(b[j]<c[k]){
                j++;
            }else{
                k++;
            }
        }
        return res;
    }
}
