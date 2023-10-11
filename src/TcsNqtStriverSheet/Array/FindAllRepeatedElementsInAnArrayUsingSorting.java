package TcsNqtStriverSheet.Array;
import java.util.Arrays;

//tc:O(NlogN)+O(N*N)
//sc:O(1)
public class FindAllRepeatedElementsInAnArrayUsingSorting {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,1,0,-4,-4,0};
        findRepeatedElements(arr);

    }static void findRepeatedElements(int[] arr){
        Arrays.sort(arr);
       // System.out.println(Arrays.toString(arr));
      //  System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length-1; i++) {
            int count=0;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]==arr[j]){
                    arr[j]= Integer.MIN_VALUE;
                    count++;
                }
            }
            if (count>0 && arr[i]!=Integer.MIN_VALUE){
                System.out.print(arr[i]+" ");
            }

        }
    }
}
