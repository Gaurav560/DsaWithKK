package ArrayAndArrayList;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static int[] getConcatenation(int[] nums) {
int[] arr1=new int[2* nums.length];
        for (int i = 0; i < nums.length; i++) {
           arr1[i]=nums[i];
            arr1[i+ nums.length]=nums[i];
        }

        return arr1;
    }

    public static void main(String[] args) {
        int[] arr={1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
}
