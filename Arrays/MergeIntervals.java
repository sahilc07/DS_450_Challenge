package Arrays;

import java.util.*;

public class MergeIntervals{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intervals[][] = {{1,3},{2,6},{8,10},{15,18}};

        int result[][] = merge(intervals);
        for(int i=0; i<result.length; i++){                                 //total rows
            for(int j=0; j<result[0].length; j++){                          //length of each rows (no. of columns)
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }

    static int[][] merge(int intervals[][]){
        LinkedList <int[]> merged = new LinkedList<>();
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));        //comparing first elements of each intervals

        for(int[] interval: intervals){
            if(merged.isEmpty() || merged.getLast()[1]<interval[0]){
                merged.add(interval);
            } else{
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}