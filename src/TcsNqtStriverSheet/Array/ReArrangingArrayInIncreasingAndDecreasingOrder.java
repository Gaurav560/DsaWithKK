package TcsNqtStriverSheet.Array;

import java.util.Arrays;

public class ReArrangingArrayInIncreasingAndDecreasingOrder {
    //rearrange the first half in increasing and second half in decreasing


//O(nlogn) for sorting the array using Arrays.sort()
    //and O(n) for printing the array
    //tc: O(nlogn)+O(n)
    //sc:O(1)
    public static void main(String[] args)
    {
        int[] arr={22,5,44,22,76,2,126,1,0};
reArrange(arr);
    }
    public static void reArrange(int[] arr){
        Arrays.sort(arr);

        for (int i = 0; i <= arr.length/2; i++) {
            System.out.print(arr[i]+" ");

        }
        for (int i = arr.length-1; i > arr.length/2 ; i--)
        {
            System.out.print(arr[i]+" ");

        }
    }
}
