package TcsNqtStriverSheet.Array;

import java.util.Arrays;

public class LargestElementInArrayBruteWithInbuiltMethod {
    public static void main(String[] args) {
        int[] nums={33,44444,55,3522,7689};
        System.out.println(largest(nums));
    }
    public static int largest(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length-1];
    }
}
