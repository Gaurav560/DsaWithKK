package ArrayAndArrayList;

public class NoOfGoodPairs {

    public static int numIdenticalPairs(int[] nums) {
        int noOfGoodPairs=0;
        int n=nums.length;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j < n; j++) {
                if (nums[i]==nums[j]){
                    noOfGoodPairs++;
                }
            }
        }


return noOfGoodPairs;
    }
    public static void main(String[] args) {
int[] arr={1,1,1,1};
        System.out.println(numIdenticalPairs(arr));
    }
}
