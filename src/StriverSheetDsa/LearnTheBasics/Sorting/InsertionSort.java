package StriverSheetDsa.LearnTheBasics.Sorting;

import java.util.Arrays;


//insertion sort:take an element starting from 2nd position and compares it .if the previous element is
//greater than the current element ,just swap.do swapping un till the first element from backwards un till
//everything gets sorted.

//tc:worst case and average case :O(N**2)
//best case :O(N) as it is always sorted .no swapping happens .
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={12,34,65,333,5555,543};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    } public static int[] bubbleSort(int[] arr){
        int n= arr.length;
        for (int i = 0; i <= n-1; i++) {
            int j=i;
            while (j>0 && arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        return arr;
    }
}
