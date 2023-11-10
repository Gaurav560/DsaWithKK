package StriverSheetDsa.LearnImportantSortingTechniques.Sorting2;

import java.util.ArrayList;
import java.util.Arrays;


//Divide and merge (Recursion and backtracking)
//NlogN :tc
public class MergeSort {
    public static void main(String[] args) {
        int[] arr={12,34,65,333,5555,543};
        int low=0;
        int high=arr.length-1;
        mergeSort(arr,low,high);
        for (int x:arr
             ) {
            System.out.print(x+" ");
        }

    }
    public static void mergeSort(int[] arr,int low, int high)
    {
        if (low>=high)return ;
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);



    }

    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
if (arr[left]<=arr[right]){
    list.add((Integer)arr[left]);
    left++;
}
else {
    list.add((Integer)arr[right]);
    right++;
}

        }
        while(left<=mid){
            list.add((Integer)arr[left]);
            left++;
        }
        while (right<=high){
            list.add((Integer)arr[right]);
            right++;
        }


        for (int i = low; i <=high ; i++) {
            arr[i]= list.get(i-low);

        }

    }


}
