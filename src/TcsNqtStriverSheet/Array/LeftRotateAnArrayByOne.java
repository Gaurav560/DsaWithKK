package TcsNqtStriverSheet.Array;

import java.util.Arrays;

public class LeftRotateAnArrayByOne {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(leftRotate(arr)));
    }public static int[] leftRotate(int[] arr){
        int temp=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            arr[i-1]=arr[i];

        }arr[arr.length-1]=temp;
        return arr;
    }
}
