package ArrayAndArrayList.TwoPointers;

import java.util.Arrays;

public class SortAnArrayOf0and1 {
    public static int[] sortedArray(int[] nums){
int noOfZeros=0;
        for (int num : nums) {
            if (num == 0) {
                noOfZeros=noOfZeros+1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i<noOfZeros){
                nums[i]=0;
            }else nums[i]=1;
        }

return  nums;


    }
    public static void main(String[] args) {
int[] arr={0,1,1,1,1,0,0,0,0,1};
        System.out.println(Arrays.toString(sortedArray(arr)));
    }
}
