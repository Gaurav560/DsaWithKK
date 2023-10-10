package TcsNqtStriverSheet.Array;

import java.util.Arrays;

//tc:O(d)+O(n-d)+O(n)
//sc:O(1)
public class LeftRotateAnArrayByKElementsOptimalApproach {
    public static void main(String[] args) {
        int[]arr= {3,5,4,33,11,0,-55,44};
        //reverse upto first 3 elements
        int k=3;
        int d=k%arr.length;
        reverseByKElements(arr,0,d-1);
        reverseByKElements(arr,d,arr.length-1);
        reverseByKElements(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }public static void reverseByKElements(int[] arr,int startIndex, int endIndex){
        while (startIndex<=endIndex){
            int temp=arr[startIndex];
            arr[startIndex]=arr[endIndex];
            arr[endIndex]=temp;
            startIndex++;
            endIndex--;
        }

    }
}
