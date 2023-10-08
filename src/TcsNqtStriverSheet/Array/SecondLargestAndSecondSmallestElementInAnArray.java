package TcsNqtStriverSheet.Array;

import java.util.Arrays;

public class SecondLargestAndSecondSmallestElementInAnArray {
    public static void main(String[] args) {
        int[] nums={2,44};
        find(nums);

    }public static void find(int[] arr){
        Arrays.sort(arr);
        if (arr.length<=1){
            System.out.println(-1+" "+-1);
        }  else {

            System.out.println("2nd smallest element  "+arr[1]);
            System.out.println("2nd largest element  "+arr[arr.length-2]);
        }
    }
}
