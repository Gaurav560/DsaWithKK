package TcsNqtStriverSheet.Array;

import java.util.Arrays;

//we used an extra array which will take more space
//O(N) for extra space new array used and O(N) for one iteration on array
public class ReverseAnArrayBruteForce {
    public static void main(String[] args) {
        int[] arr={33,55,22,1,-4};
        System.out.println(Arrays.toString(reverse(arr)));
    }
    public static int[] reverse(int[] arr){
        int[] newArr=new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[newArr.length-1-i]=arr[i];

        }
        return newArr;
    }
}
