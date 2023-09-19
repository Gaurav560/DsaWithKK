package ArrayAndArrayList.TwoPointers;

import java.util.Arrays;

public class SortSquares {

    public static int[] reverse(int[] arr){
       int left=0;
       int right= arr.length-1;
       while(left<right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;

       }
       return arr;


    }
    public  static  int[] sortAndSquare(int[] arr){
        int n= arr.length;
        int[] ans=new int[n];
        int leftPointer=0;
        int rightPointer=n-1;
        int k=0;
        while (leftPointer<=rightPointer){
            if (Math.abs(arr[leftPointer])>Math.abs(arr[rightPointer])){

                    ans[k++]=arr[leftPointer]*arr[leftPointer];
                leftPointer++;
                }else {
                ans[k++]=arr[rightPointer]*arr[rightPointer];
                rightPointer--;
            }

            }


        
        
        
        return  ans;
    }
    
    
    public static void main(String[] args) {
        //note the given array will be already in ascending order
        int[] arr={-10,-5,-4,0,2,3,4,6};
        System.out.println(Arrays.toString(reverse(sortAndSquare(arr))));
    }
}
