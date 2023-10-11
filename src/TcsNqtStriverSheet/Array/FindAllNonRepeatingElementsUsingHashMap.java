package TcsNqtStriverSheet.Array;

import java.util.HashMap;
import java.util.Map;

public class FindAllNonRepeatingElementsUsingHashMap {
    public static void main(String[] args) {
        int[] arr={1,2,-1,1,3,1};
        findUniqueElement(arr);
    }
    public static void findUniqueElement(int[] arr){
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int j : arr) {
            int count = 1;
            if (hashMap.containsKey(j)) {
                hashMap.put(j, ++count);
            } else {
                hashMap.put(j, count);
            }

        }
        for(Map.Entry entry:hashMap.entrySet()){
            if (1==(Integer) entry.getValue()){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
}
