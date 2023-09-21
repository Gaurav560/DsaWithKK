package ArrayAndArrayList;

import java.util.Arrays;

public class NumbersSmallerThanCurrentNumber {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int n= nums.length;
int[] ans=new int[n];
        for (int i = 0; i < n; i++) {

            int count=0;
            for (int num : nums) {
                if (nums[i] > num) {
                    count++;
                }
            }
ans[i]=count;
        }

return ans;
    }
    public static void main(String[] args) {
int[] arr={6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
}
