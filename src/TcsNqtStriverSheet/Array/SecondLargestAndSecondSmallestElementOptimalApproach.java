package TcsNqtStriverSheet.Array;

public class SecondLargestAndSecondSmallestElementOptimalApproach {
    public static void main(String[] args) {
        int[] arr={33,0,33,-23,-44,654,22,554};
        secondLargest(arr);
        secondSmallest(arr);
    }
    public static void secondLargest(int[] nums){
        int largest=nums[0];
        int secondLarge=Integer.MIN_VALUE;
        if (nums.length == 1){
            System.out.println("second largest ::"+-1);
        }
        else {
            for (int i = 1; i < nums.length ; i++) {
                if (largest<nums[i]){
                    secondLarge=largest;
                    largest=nums[i];
                }

            if (largest>nums[i])
            {
                if (secondLarge<nums[i])
                {
                    secondLarge=nums[i];
                }

            }


            }
            System.out.println("second largest is ::"+secondLarge);
        }

    }
    public static void secondSmallest(int[] nums){
int smallest=nums[0];
int secondSmallest=Integer.MAX_VALUE;
        if (nums.length == 1){
            System.out.println("second smallest ::"+-1);
        }
        else {
            for(int i=1;i< nums.length;i++){
                if (smallest>nums[i]){
                    secondSmallest=smallest;
                    smallest=nums[i];
                }
                if (smallest<nums[i]){
                    if (secondSmallest>nums[i]){
                        secondSmallest=nums[i];
                    }
                }
            }
            System.out.println("second smallest is::"+secondSmallest);

        }
    }
}
