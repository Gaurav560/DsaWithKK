package TcsNqtStriverSheet.Array.TwoDArray;

public class MaximumProductSubArrayInAnArrayBruteForce {


    //tc:O(N*N*N)
    public static void main(String[] args) {
        int[] arr={2,3,-2,3};
        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int[] arr){
        int ans=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i; j < arr.length; j++)
            {
                int prod=1;

                for (int k = i; k <= j; k++)
                {
                    prod *=arr[k];
                }
                ans=Math.max(ans,prod);
            }
            
        }
        return ans;
    }
}
