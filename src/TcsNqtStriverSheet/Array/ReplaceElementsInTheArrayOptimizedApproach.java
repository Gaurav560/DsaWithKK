package TcsNqtStriverSheet.Array;

import java.util.Arrays;
import java.util.HashMap;


public class ReplaceElementsInTheArrayOptimizedApproach {
    public static void main(String[] args) {
        int[] arr={4,6,7,5,1,0,5,-5,2,3};
        System.out.println(Arrays.toString(replace(arr)));
    }public static int[] replace(int[] arr){
        int[] newArr=new int[arr.length];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        Arrays.sort(newArr);
     HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int j : newArr) {
            if (!hashMap.containsKey(j)) {
                hashMap.put(j, hashMap.size() + 1);
            }

        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=hashMap.get(arr[i]);

        }


        return arr;
    }
}
