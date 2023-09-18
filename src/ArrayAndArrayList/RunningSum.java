package ArrayAndArrayList;

import java.util.Arrays;

//prefix sum
public class RunningSum {
    public static int[] runningSum(int[] nums) {
int[] arr=new int[nums.length];
arr[0]=nums[0];

        for (int i = 1; i < nums.length; i++) {
            arr[i]=arr[i-1]+nums[i];
        }
return arr;
    }

    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr1)));
    }
}
