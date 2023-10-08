package TcsNqtStriverSheet.Array;

public class LargestElementInAnArray {
    public static void main(String[] args) {
int[] arr={44,5555,6,0,-4};
        System.out.println(largest(arr));
    }
    public static int largest(int[] nums){
        int largest=Integer.MIN_VALUE;
        for (int x:nums
             ) {
            if (x>largest)
            {
                largest=x;
            }

        }
        return largest;
    }
}
