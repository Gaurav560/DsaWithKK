package TcsNqtStriverSheet.Array;

public class SmallestNumberInAnArray {
    public static void main(String[] args) {
       int[] nums={0,2,-5,4,1,8,111,33};
        System.out.println(returnSmallest(nums));
    }
    public static int returnSmallest(int[] nums)
    {
        int smallest=Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < smallest) {
                smallest = num;
            }

        }
return smallest;
    }
}
