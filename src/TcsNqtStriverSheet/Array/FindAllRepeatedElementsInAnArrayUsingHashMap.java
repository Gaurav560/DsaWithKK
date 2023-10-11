package TcsNqtStriverSheet.Array;

import java.util.HashMap;
import java.util.Map;

public class FindAllRepeatedElementsInAnArrayUsingHashMap {
    public static void main(String[] args) {
        int[] arr={2,3,4,2,2,2,55,44,-2,0,0,0,-2};
        findRepeatedElements(arr);
    }public static void findRepeatedElements(int[] arr)
    {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int x:arr){
            int count=1;
            if (!hashMap.containsKey(x)){
                hashMap.put(x,count);
            }else {
                hashMap.put(x,++count);
            }
        }

        for (Map.Entry entry:hashMap.entrySet()){
            if ((Integer)entry.getValue()>1){
                System.out.print(entry.getKey()+" ");
            }
    }

    }
}
