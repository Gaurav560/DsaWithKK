package StriverSheetDsa.LearnTheBasics.Sorting;

import java.util.Arrays;

//in this sorting method,first we find smallest element and
//swap with first element of array.
// and then we find the smallest element
//in remaining array and swap with the first element of remaining array.
//we loop till 2nd last element in outer loop and  to last element in inner loop .

//tc for all cases will O(N**2)
public class SelectionSort {
    public static void main(String[] args) {

        int[] arr={12,6754,-55,45,67,22,11,0};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
    public static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min=i;
            for (int j = i; j < arr.length ; j++) {
                if (arr[min]>arr[j]){
                    min=j;
                }

            }
            //swap
            if (i!=min){
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }

        }
        return arr;

    }
}
