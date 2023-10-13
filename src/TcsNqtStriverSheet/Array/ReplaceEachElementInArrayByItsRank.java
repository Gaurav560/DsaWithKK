package TcsNqtStriverSheet.Array;

import java.util.Arrays;

//tc:O(N*N)
public class ReplaceEachElementInArrayByItsRank {
    public static void main(String[] args) {
int[] arr={2,4,6,2,66,-4,0};
        System.out.println(Arrays.toString(replace(arr)));

    }public static int[] replace(int[] arr){
        int n=arr.length;int[] newArr=new int[n];

        for (int i = 0; i < n; i++) {
            int count=0;
            for (int k : arr) {
                if (arr[i] > k) {
                    count++;
                }

            }
            newArr[i]=count+1;
        }return newArr;
    }
}
