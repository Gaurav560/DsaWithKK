package LinearSearchAlgo;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr={

                {23,12,45,65,4},
                {2,65,44,1},
                {18,17,9,34}
        };
        int target=65;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr,int target){
        //arr.length in 2d array gives no of rows
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column <arr[row].length ; column++) {
                if (arr[row][column]==target){
return new int[]{row,column};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
