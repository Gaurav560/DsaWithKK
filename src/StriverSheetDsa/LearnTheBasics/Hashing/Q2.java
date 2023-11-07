package StriverSheetDsa.LearnTheBasics.Hashing;

import java.util.HashMap;
import java.util.Map;

public class Q2 {
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

        int maxElement=0;
        int minElement=0;
        int maxCount=0;
        int minCount=arr.length;

        for(Map.Entry<Integer,Integer> m:hashMap.entrySet())
        {
            int count=m.getValue();
            int element=m.getKey();

            if (count>maxCount){
                maxElement=element;
                maxCount=count;
            }
            if (count<minCount){
minCount=count;
minElement=element;
            }




        }

        System.out.println("the highest frequency element is ::"+maxElement);
        System.out.println("the lowest frequency element is ::"+minElement);
    }
}
