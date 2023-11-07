package StriverSheetDsa.LearnTheBasics.Hashing;

import java.util.HashMap;
import java.util.Map;

public class Q1 {
    public static void main(String[] args) {
        int[] arr={10,5,10,15,10,5};
        count(arr);

    }
    public static void count(int[] arr){
        HashMap<Integer,Integer> hashMap=new HashMap<>();
       for(int x:arr)
       {
      if (hashMap.containsKey(x))
      {
          hashMap.put(x, hashMap.get(x)+1);
      }else hashMap.put(x,1);
       }
       for(Map.Entry<Integer,Integer> m:hashMap.entrySet()){
           System.out.println(m.getKey()+" ->"+m.getValue());
       }
    }

}
