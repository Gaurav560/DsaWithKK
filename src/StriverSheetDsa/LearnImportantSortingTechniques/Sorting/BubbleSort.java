package StriverSheetDsa.LearnImportantSortingTechniques.Sorting;

import java.util.Arrays;

/*in the bubble sort,we find the largest element by comparing the elements and
 swapping them until 2nd last element

 worst case tc::O(N**2)
 best case when everything is sorted in ascending order O(N*N)


  */


public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={12,34,65,333,5555,543};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }   public static int[] bubbleSort(int[] arr){
int n=arr.length;
int didSwap=0;
        for (int i = n-1; i >=1 ; i--) {
            for (int j = 0; j <=i-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    didSwap +=1;
                }
            }
            if (didSwap==0)break;

        }
        return arr;
    }
}
