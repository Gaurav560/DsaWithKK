package TcsNqtStriverSheet.Array;

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
        for (int i = 0; i < nums.length; i++) {
            if (secondLargest<nums[i] && nums[i]!=largest){
                secondLargest=nums[i];
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
        for (int i = 0; i < nums.length; i++) {
            if (secondSmallest>nums[i] && nums[i]!=smallest){
                secondSmallest=nums[i];
            }

        }
        System.out.println("second smallest is ::"+secondSmallest);}
    }
}
