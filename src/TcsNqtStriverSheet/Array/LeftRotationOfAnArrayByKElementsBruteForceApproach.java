package TcsNqtStriverSheet.Array;

import java.util.Arrays;

//tc-O(d)+O(n-d)+O(d)
//sc-O(d) as extra array is used in brute force to shift in new array
public class LeftRotationOfAnArrayByKElementsBruteForceApproach {
    public static void main(String[] args) {
        int[] arr={33,2,1,5,3,2,7};
        System.out.println(Arrays.toString(rotatedByK(arr,3)));
    }public static int[] rotatedByK(int[] arr,int k){
        int d=k%arr.length;
        int[] temp=new int[d];
        System.arraycopy(arr, 0, temp, 0, d);
        for (int i = d; i < arr.length; i++) {
            arr[(i-d)]=arr[i];
        }

        for (int i = arr.length-d; i < arr.length; i++) {
            arr[i]=temp[i-(arr.length-d)];

        }
        return arr;
    }
}
