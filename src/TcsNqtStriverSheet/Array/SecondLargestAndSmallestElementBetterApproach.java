package TcsNqtStriverSheet.Array;


//time complexity: this is running for two passes .thus two O(N)+O(N)=O(2N)

public class SecondLargestAndSmallestElementBetterApproach {

    public static void main(String[] args) {
int[] arr={2,1};
        secondLargest(arr);
        secondSmallest(arr);
    }
    public static void secondLargest(int[] nums)
    {
        if (nums.length<=1){
            System.out.println("second largest ::"+-1);
        }
        else {
int largest=nums[0];
int secondLargest=Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (largest<nums[i]){
                largest=nums[i];
            }

        }
            for (int num : nums) {
                if (secondLargest < num && num != largest) {
                    secondLargest = num;
                }

            }
        System.out.println("second largest is "+secondLargest);}
    }
    public static void secondSmallest(int[] nums){
        if (nums.length<=1){
            System.out.println("second smallest::"+-1);
        }
        else {
int smallest=nums[0];
        for (int i = 1; i < nums.length ; i++) {
            if (smallest>nums[i]){
                smallest=nums[i];
            }

        }
        int secondSmallest=Integer.MAX_VALUE;
            for (int num : nums) {
                if (secondSmallest > num && num != smallest) {
                    secondSmallest = num;
                }

            }
        System.out.println("second smallest is ::"+secondSmallest);}
    }
}
