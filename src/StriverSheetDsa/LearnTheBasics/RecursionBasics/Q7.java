package StriverSheetDsa.LearnTheBasics.RecursionBasics;

import java.util.Arrays;

public class Q7 {
    //reverse a given array using recursive approach
    public static void main(String[] args) {
        int[] arr={3,0,-55,24,5,6,7,9,2};
        System.out.println(Arrays.toString(swap(arr,0,arr.length-1)));

    }public static int[] swap(int[] arr,int start,int end){
        if (start>=end)return arr;
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
      return swap(arr,start+1,end-1);
    }
}
