package ArrayAndArrayList;

import java.util.Arrays;

public class ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
         int[] newArr=new int[2*n];
         int count=0;
        for (int i = 0; i < n; i++) {
           newArr[count]=nums[i];
           newArr[count+1]=nums[i+n];
           count=count+2;

        }

return newArr;
    }

    public static void main(String[] args) {
int[] arr={2,5,1,3,4,7};
int n=arr.length/2;
        System.out.println(Arrays.toString(shuffle(arr,n)));
    }
}
