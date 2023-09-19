package ArrayAndArrayList.TwoPointers;

import java.util.Arrays;

public class OptimizedApproachForSorting0and1WithTwoPointers {
    public static void swap(int[] arr,int i,int j){

       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
    }
    public static int[] sort(int[] nums){

        int leftPointer=0;
        int rightPointer=nums.length-1;
       while(leftPointer<rightPointer){
           if (nums[leftPointer]==1 && nums[rightPointer]==0){
               swap(nums,leftPointer,rightPointer );
               leftPointer++;
               rightPointer--;
           }
              if (nums[leftPointer]==0 ){leftPointer++;}
          if (nums[rightPointer]==1){rightPointer--;}

       }


        return nums;
    }

    public static void main(String[] args) {
        int[] arr1={0,1,1,1,1,1,1,0,0,0,0};
        System.out.println(Arrays.toString(sort(arr1)));
    }
}
