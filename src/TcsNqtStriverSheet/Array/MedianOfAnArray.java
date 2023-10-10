package TcsNqtStriverSheet.Array;

import java.util.Arrays;
//tc:O(NlogN) as we are using Arrays.sort
//sc:O(1
public class MedianOfAnArray {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,11,33};
        System.out.println("the median is ::"+findMedian(arr));
    }
    public static double findMedian(int[] arr){
        Arrays.sort(arr);
        if (arr.length%2!=0){
        return arr[arr.length/2];}

        else {
            return (double) (arr[arr.length/2]+arr[(arr.length/2)-1])/2;
        }
    }

}
