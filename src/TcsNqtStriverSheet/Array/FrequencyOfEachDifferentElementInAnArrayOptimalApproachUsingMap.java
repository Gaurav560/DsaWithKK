package TcsNqtStriverSheet.Array;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachDifferentElementInAnArrayOptimalApproachUsingMap {
    public static void main(String[] args) {
        Integer[] arr={33,22,11,44,233,22,11,33,22,11,33};
        countFrequencyUsingMap(arr);
    }
    public static void countFrequencyUsingMap(Integer[] arr){
HashMap<Integer,Integer> hm=new HashMap<>();

//putting entries in Hashmap
        for (Integer integer : arr) {
            if (hm.containsKey(integer)) {
                hm.put(integer, hm.get(integer) + 1);
            } else {
                hm.put(integer, 1);
            }

        }

        //retrieving entries from map
        for(Map.Entry entry:hm.entrySet())
        {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}

