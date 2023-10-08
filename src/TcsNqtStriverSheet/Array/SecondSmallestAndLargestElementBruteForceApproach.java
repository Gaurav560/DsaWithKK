package TcsNqtStriverSheet.Array;

import java.util.Arrays;

public class SecondSmallestAndLargestElementBruteForceApproach {
    public static void main(String[] args) {
       int[] nums={44,22};
        System.out.println("second Largest ::"+secondLargest(nums));
        System.out.println("second Smallest ::"+secondSmallest(nums));

    }
    public static int secondLargest(int[] nums)
    {
        Arrays.sort(nums);
        int secondLarge=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length-1; i++)
        {
         if (nums[i]>secondLarge && nums[i]<nums[nums.length-1]){
             secondLarge=nums[i];
         }
        }
        return secondLarge;

    }
   public static int secondSmallest(int[] nums)
    {
int secondSmall=Integer.MAX_VALUE;
Arrays.sort(nums);
        for(int i = 1; i <nums.length ; i++) {
           if (nums[i]<secondSmall && nums[i]>nums[0]){
               secondSmall=nums[i];
           }
        }
        return secondSmall;
    }

}
