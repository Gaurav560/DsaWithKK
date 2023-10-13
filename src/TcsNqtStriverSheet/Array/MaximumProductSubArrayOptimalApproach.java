package TcsNqtStriverSheet.Array;


//tc:O(N)
public class MaximumProductSubArrayOptimalApproach {
    public static void main(String[] args) {
        int[] arr={2,3,2,-2,0,1,5,0,-2,3};
        System.out.println(find(arr));

    }
    public static int find(int[] arr){
        int ans=Integer.MIN_VALUE;
        int n= arr.length;
        int prefix=1;int suffix=1;
        for (int i = 0; i <n; i++) {
            if (prefix==0){prefix=1;}
            if (suffix==0){suffix=1;}
            prefix *=arr[i];
            suffix *=arr[n-1-i];
            ans=Math.max(ans,Math.max(prefix,suffix));

        }return ans;


    }
}
