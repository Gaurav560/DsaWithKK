package LinearSearchAlgo;

public class Example1 {
    static int linearSearch(int[] arr,int target){
        if (arr.length==0){
            return  Integer.MAX_VALUE;
        }
        for (int element : arr) {
            if (element == target) {
                return 1;
            }

        }
        return Integer.MAX_VALUE;
    }


    public static void main(String[] args) {
        int[] nums={2,55,67,754,33,222,13};
        int target=44;
       int ans= linearSearch(nums,target);
        System.out.println(ans);
    }
}
