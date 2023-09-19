package ArrayAndArrayList.TwoPointers;

import java.util.Arrays;

public class SortEvenAndOddWithTwoPointers {
    public static void swap(int[] arr,int i,int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
   public static int[] sortEvenOdd(int[] nums){
        int n= nums.length;
        int leftPointer=0;
        int rightPointer= n-1;
        while(leftPointer<rightPointer){
            if (nums[leftPointer]%2!=0 &&nums[rightPointer]%2==0){
                swap(nums,leftPointer,rightPointer);
                leftPointer++;
                rightPointer--;
            }
            if (nums[leftPointer]%2==0){
                leftPointer++;
            }
            if (nums[rightPointer]%2!=0){
                rightPointer--;
            }
        }
       return nums;
   }


    public static void main(String[] args) {
        int[] arr={2,3,7,44,544,345,23,22,1,235,11,0};
        System.out.println(Arrays.toString(sortEvenOdd(arr)));
    }
}
