package TcsNqtStriverSheet.Array;

import java.util.Arrays;

public class AverageOfElementsInAnArray {
    public static void main(String[] args) {
        int[] arr={2,4,5,3,9};
        System.out.println(average(arr));
    }
    public static  double average(int[] arr){
        double res;
        return res= Arrays.stream(arr).sum()/ (double)arr.length;
    }

}
