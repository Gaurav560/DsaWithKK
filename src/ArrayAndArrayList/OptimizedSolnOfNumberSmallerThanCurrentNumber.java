package ArrayAndArrayList;

import java.util.Arrays;

public class OptimizedSolnOfNumberSmallerThanCurrentNumber {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        //101 isliye likhe hain kyunki 101 se bada koi value nahi hai nums array mein
        int[] bucket=new int[101];
        //counting the repetition of each elements.
        for (int num : nums) {
            bucket[num]++;

        }
        for (int i = 1; i <101 ; i++) {
            bucket[i]+=bucket[i-1];
        }
        for (int i = 0; i < nums.length; i++) {
            int position=nums[i];
            if (position==0){
                nums[i]=0;

            }else nums[i]=bucket[position-1];
        }
        return nums;
    }
    public static void main(String[] args) {
int[] arr={8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
}
