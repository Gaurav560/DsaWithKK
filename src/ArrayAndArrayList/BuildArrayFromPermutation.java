package ArrayAndArrayList;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static int[] buildArray(int[] nums) {
int[] newArray=new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
           newArray[i]=nums[nums[i]];
        }
return newArray;
    }

    public static void main(String[] args) {
        int[] array={5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArray(array)));
    }
}
