package TcsNqtStriverSheet.Array;

import java.util.Arrays;

public class ReverseAnArrayTwoPointerApproach {
    public static void main(String[] args) {
int[] arr={2,5,6,8,5,3,1,-4,0};
        System.out.println(Arrays.toString(twoPointer(arr)));
    }public static int[] twoPointer(int[] arr)
    {
        int i=0;
        for (int j = arr.length-1 ; j > arr.length/2; j--)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
        }
     return arr;
    }
}
