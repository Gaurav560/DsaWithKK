package TcsNqtStriverSheet.Array.TwoDArray;

//tc:O(N*N)
public class MaximumProductSubArrayBetterApproach {
    public static void main(String[] args) {
        int[] arr={2,3,-2,3};
        System.out.println(findMax(arr));
    }public static int findMax(int[] arr){
int ans=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int prod=1;
            for (int j = i; j < arr.length; j++) {
                prod *=arr[j];
                ans=Math.max(prod,ans);
            }
        }
        return ans;
    }
}
