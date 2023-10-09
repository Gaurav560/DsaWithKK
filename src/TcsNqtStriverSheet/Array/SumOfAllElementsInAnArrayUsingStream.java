package TcsNqtStriverSheet.Array;

import java.util.Arrays;

//using stream api
//O(N) tc and O(1) for space complexity
public class SumOfAllElementsInAnArrayUsingStream {
    public static void main(String[] args) {
        int[] arr={2,5,33,1,3};
        System.out.println(sumOfAllElements(arr));
    }
    public static int sumOfAllElements(int[] arr){
        return Arrays.stream(arr).sum();
    }
}
