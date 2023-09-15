package LinearSearchAlgo;

public class FindMin {
    //assuming nums is not an empty array
static int findMin(int[] nums){
    int min=nums[0];
    for (int i = 1  ; i < nums.length; i++) {

        if (nums[i]<min){
            min=nums[i];
        }

    }return min;
}

    public static void main(String[] args) {
int[] arr={18,-6,5,0,33,1,90};
        System.out.println(findMin(arr));
    }
}
