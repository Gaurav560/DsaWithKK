package TcsNqtStriverSheet.Array;

import java.util.HashMap;
//tc:O(N)
//sc:O(1)
public class RemoveAllDuplicatesFromAnArrayUsingHashMap {
    public static void main(String[] args) {
        int[] arr={4,3,9,2,4,1,10,89,34};
        remove(arr);
    }
    public static void remove(int[] arr){
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int j : arr) {
            if (!hashMap.containsKey(j)) {
                System.out.print(j + " ");
                hashMap.put(j, 1);
            }

        }
    }
}
